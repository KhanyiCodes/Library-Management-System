package model;

public class Member {

    public void borrowBook() {
        // Member can borrow books
        System.out.println("Member: Borrowing a book.");
    }

    public void returnBook() {
        // Member can return books
        System.out.println("Member: Returning a book.");
    }

    public void searchBooks() {
        // Member can search books
        System.out.println("Member: Searching for books.");
    }

    // Member doesn't have permission to add, remove, or update books
}
