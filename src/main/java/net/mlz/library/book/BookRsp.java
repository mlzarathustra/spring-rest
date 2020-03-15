package net.mlz.library.book;

// could be used as a response class for the BookService
// in order to have better control over the fields shown.

public class BookRsp {
    private Book book;
    private String message="OK";

    public BookRsp(Book b) { this.book=b; }

    public Book getBook() { return book; }
    public String getMessage() { return message; }
    public void setMessage(String m) { message=m; }

}
