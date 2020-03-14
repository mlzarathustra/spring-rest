package net.mlz.library.book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();
    public Book getBook(Integer id);
    public Book putBook(Book b);  // update or create
    public Book delBook(Integer id);
}
