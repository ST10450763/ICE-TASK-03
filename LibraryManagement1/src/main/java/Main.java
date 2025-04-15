/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tivarnanaidoo
 */
public class Main {
    public static void main(String[] args) {
        // Create a LibraryBook object
        LibraryBook book = new LibraryBook("Java Programming", 2, 10.00);

        // Try to borrow the book
        boolean borrowSuccess = book.borrowBook();
        System.out.println("Borrowing book: " + (borrowSuccess ? "Success" : "Failed"));

        // Try to return the book
        boolean returnSuccess = book.returnBook();
        System.out.println("Returning book: " + (returnSuccess ? "Success" : "Failed"));

        // Calculate and print the late fee for 3 days
        double lateFee = book.calculateLateFee(3);
        System.out.println("Late fee for 3 days: R" + lateFee);
    }
}
