package dao;

import model.Book;
import java.util.List;

public interface BookDAO {
    void addBook(Book book);
    void removeBook(int bookId);
    void updateBook(Book book);
    Book getBookById(int bookId);
    List<Book> getAllBooks();
    List<Book> searchBooks(String keyword);
}
