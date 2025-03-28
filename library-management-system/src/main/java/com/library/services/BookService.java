package com.library.services;

import com.library.models.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookService {
    private List<Book> bookCatalog;

    public BookService() {
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookCatalog.add(book);
    }

    public void removeBook(String isbn) {
        bookCatalog.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void updateBook(Book updatedBook) {
        for (int i = 0; i < bookCatalog.size(); i++) {
            if (bookCatalog.get(i).getIsbn().equals(updatedBook.getIsbn())) {
                bookCatalog.set(i, updatedBook);
                return;
            }
        }
    }

    public Optional<Book> searchBook(String title) {
        return bookCatalog.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : bookCatalog) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookCatalog);
    }
}