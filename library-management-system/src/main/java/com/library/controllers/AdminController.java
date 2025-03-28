package com.library.controllers;

import com.library.models.Book;
import com.library.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully!";
    }

    @DeleteMapping("/removeBook/{id}")
    public String removeBook(@PathVariable Long id) {
        bookService.removeBook(id);
        return "Book removed successfully!";
    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return "Book updated successfully!";
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}