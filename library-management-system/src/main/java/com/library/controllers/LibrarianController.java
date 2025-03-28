package com.library.controllers;

import com.library.models.Book;
import com.library.models.User;
import com.library.services.BookService;
import com.library.services.UserService;

import java.util.List;

public class LibrarianController {

    private final BookService bookService;
    private final UserService userService;

    public LibrarianController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    public void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            bookService.borrowBook(book, user);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(User user, Book book) {
        bookService.returnBook(book, user);
        System.out.println("Book returned successfully.");
    }

    public List<Book> searchBooks(String query) {
        return bookService.searchBooks(query);
    }

    public List<Book> getOverdueBooks(User user) {
        return bookService.getOverdueBooks(user);
    }
}