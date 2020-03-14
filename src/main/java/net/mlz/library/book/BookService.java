package net.mlz.library.book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();
    public Book getBook(Integer id);
    public Book postBook(Book b);  // create
    public Book putBook(Integer id, Book b); // update
    public Book delBook(Integer id);
}
