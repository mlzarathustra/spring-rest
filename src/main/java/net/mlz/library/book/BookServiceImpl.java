package net.mlz.library.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    @Override
    public Book putBook(Book b) {
        return bookRepo.save(b);
    }

    @Override
    public Book delBook(Integer id) {
        return null;
    }
}
