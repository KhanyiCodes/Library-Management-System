package com.library.controllers;

import com.library.models.Book;
import com.library.services.BookService;
import com.library.models.User;
import com.library.services.UserService;

import java.util.List;

public class MemberController {
    private final BookService bookService;
    private final UserService userService;

    public MemberController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    public List<Book> searchBooks(String query) {
        return bookService.searchBooks(query);
    }

    public List<Book> viewBorrowedBooks(User user) {
        return userService.getBorrowedBooks(user);
    }

    public String borrowBook(User user, String bookId) {
        return bookService.borrowBook(user, bookId);
    }

    public String returnBook(User user, String bookId) {
        return bookService.returnBook(user, bookId);
    }
}