package net.mlz.library.controllers;
import net.mlz.library.book.Book;
import net.mlz.library.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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
        return bookService.putBook(book);
    }



}
