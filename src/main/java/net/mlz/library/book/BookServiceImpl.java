package net.mlz.library.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepo;

    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getBookList() {
        List<Book> list=new ArrayList<>();
        for (Book b : bookRepo.findAll() ) list.add(b);
        return list;
    }

    @Override
    public Book getBook(Integer id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public Book postBook(Book b) {
        return bookRepo.save(b);
    }

    @Override
    public Book putBook(Integer id, Book b) {
        return null;
    }

    @Override
    public Book delBook(Integer id) {
        return null;
    }
}
