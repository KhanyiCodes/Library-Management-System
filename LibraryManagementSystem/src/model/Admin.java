package model;

public class Admin {

    public void addBook() {
        // Admin can add books to the system
        System.out.println("Admin: Adding a new book to the catalog.");
    }

    public void removeBook() {
        // Admin can remove books from the system
        System.out.println("Admin: Removing a book from the catalog.");
    }

    public void updateBook() {
        // Admin can update book details
        System.out.println("Admin: Updating book details.");
    }

    public void borrowBook() {
        // Admin can borrow books (or override restrictions if needed)
        System.out.println("Admin: Borrowing a book.");
    }

    public void returnBook() {
        // Admin can return books
        System.out.println("Admin: Returning a book.");
    }

    public void searchBooks() {
        // Admin can search books
        System.out.println("Admin: Searching for books.");
    }
}
