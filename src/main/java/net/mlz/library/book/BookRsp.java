package net.mlz.library.book;

// could be used as a response class for the BookService
// in order to have better control over the fields shown.

public class BookRsp {
    Book book;

    BookRsp(Book b) { this.book=b; }

    public int getId() { return book.getId(); }

    public String getAuthor() {
        return book.getAuthor();
    }
    public void setAuthor(String author) {
        book.setAuthor(author);
    }

    public String getTitle() {
        return book.getTitle();
    }
    public void setTitle(String title) {
        book.setTitle(title);
    }

    public String getYear() {
        return book.getYear();
    }
    public void setYear(String year) {
        book.setYear(year);
    }


}
