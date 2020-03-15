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
        for (Book b : bookRepo.findAll() ) list.add(b);  // list
        return list;
    }

    @Override
    public Book getBook(Integer id) {                   //  get
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public Book postBook(Book b) {
        return bookRepo.save(b);
    }   // create

    @Override                                                   // update
    public Book putBook(Book rpl) {
        Book org=bookRepo.findById(rpl.getId()).orElse(null);
        if (org == null) return null;
        org.copy(rpl);
        bookRepo.save(org);
        return org;
    }

    @Override
    public void delBook(Integer id) {                           // delete
        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
        }
    }
}
