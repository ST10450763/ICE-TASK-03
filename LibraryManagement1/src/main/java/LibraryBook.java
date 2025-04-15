/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tivarnanaidoo
 */

public class LibraryBook {
    // Private fields
    private String title;
    private int totalCopies;
    private int borrowedCopies;
    private double pricePerDayLate;

    // Constructor
    public LibraryBook(String title, int totalCopies, double pricePerDayLate) {
        this.title = title;
        this.totalCopies = totalCopies;
        this.pricePerDayLate = pricePerDayLate;
        this.borrowedCopies = 0;
    }

    // Method to check availability
    public boolean isAvailable() {
        return (totalCopies - borrowedCopies) > 0;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable()) {
            borrowedCopies++;
            return true;
        }
        return false;
    }

    // Method to return a book
    public boolean returnBook() {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            return true;
        }
        return false;
    }

    // Method to calculate late fee
    public double calculateLateFee(int daysLate) {
        return daysLate * pricePerDayLate;
    }

    // Getters for testing purposes
    public String getTitle() {
        return title;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getBorrowedCopies() {
        return borrowedCopies;
    }

    public double getPricePerDayLate() {
        return pricePerDayLate;
    }

    
}
