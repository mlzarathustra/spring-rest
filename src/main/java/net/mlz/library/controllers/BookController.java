package net.mlz.library.controllers;


import net.mlz.library.book.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/book")
public class BookController {

    Logger log = LoggerFactory.getLogger(BookController.class);

    BookController() {

    }

    @RequestMapping(path="/", method= RequestMethod.GET, produces="application/json")
    public Book getBooks() {
        log.info("GET (no args)");
        return new Book();
    }



}
