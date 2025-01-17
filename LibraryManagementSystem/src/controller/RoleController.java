package controller;

import model.Admin;
import model.Librarian;
import model.Member;

public class RoleController {

    public static void main(String[] args) {
        // Simulating user input for different roles
        String roleInput = "ADMIN"; // Can be ADMIN, LIBRARIAN, or MEMBER (could be dynamic based on user login)

        switch (roleInput) {
            case "ADMIN":
                Admin admin = new Admin();
                admin.addBook();
                admin.removeBook();
                admin.updateBook();
                admin.borrowBook();
                admin.returnBook();
                admin.searchBooks();
                break;

            case "LIBRARIAN":
                Librarian librarian = new Librarian();
                librarian.borrowBook();
                librarian.returnBook();
                librarian.searchBooks();
                break;

            case "MEMBER":
                Member member = new Member();
                member.borrowBook();
                member.returnBook();
                member.searchBooks();
                break;

            default:
                System.out.println("Invalid role");
        }
    }
}
