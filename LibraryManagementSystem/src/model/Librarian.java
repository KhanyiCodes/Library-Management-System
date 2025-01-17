package model;

public class Librarian {

    public void borrowBook() {
        // Librarian can borrow books
        System.out.println("Librarian: Borrowing a book.");
    }

    public void returnBook() {
        // Librarian can return books
        System.out.println("Librarian: Returning a book.");
    }

    public void searchBooks() {
        // Librarian can search books
        System.out.println("Librarian: Searching for books.");
    }

    // Librarian doesn't have permission to add, remove, or update books
}
