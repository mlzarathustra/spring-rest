package net.mlz.library.controllers;
import net.mlz.library.book.Book;
import net.mlz.library.book.BookNotFoundException;
import net.mlz.library.book.BookRsp;
import net.mlz.library.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    Logger log = LoggerFactory.getLogger(BookController.class);

    BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path="/", produces="application/json")
    public List<Book> getBooks() {
        log.info("GET (no args)");
        return bookService.getBookList();
    }

    @GetMapping(path="/{id}", produces="application/json")
    public Book getBookById(@PathVariable("id") int id) throws BookNotFoundException {
       Book b=bookService.getBook(id);
       if (b == null) throw new BookNotFoundException("Book with id "+id+" NOT FOUND");
       return b;
    }

    @PostMapping(path="/",  produces="application/json")
    public Book postBook(@RequestBody Book book) {
        log.info("POST book");
        return bookService.postBook(book);
    }



    // TODO - delete, replace

    @PutMapping(path="/", produces="application/json")
    public Book putBook(@RequestBody Book book) {
        // replace according to ID supplied
        if (book == null) return null;
        return bookService.putBook(book);
    }

    @DeleteMapping(path="/{id}", produces="application/json")
    public void delBook(@PathVariable("id") int id) {
        log.info("DEL book id="+id);
        bookService.delBook(id);
    }


}
