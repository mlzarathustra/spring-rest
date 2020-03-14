package net.mlz.library.controllers;
import net.mlz.library.book.Book;
import net.mlz.library.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    Logger log = LoggerFactory.getLogger(BookController.class);

    BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(path="/", method= RequestMethod.GET, produces="application/json")
    public List<Book> getBooks() {
        log.info("GET (no args)");
        return bookService.getBookList();
    }

    @RequestMapping(path="/", method=RequestMethod.POST, produces="application/json")
    public Book postBook(@RequestBody Book book) {
        log.info("POST book");
        return bookService.postBook(book);
    }


    @RequestMapping(path="/{id}", method = RequestMethod.GET, produces="application/json")
    public Book getBookById(@PathVariable("id") int id) {
       return bookService.getBook(id);
    }

}
