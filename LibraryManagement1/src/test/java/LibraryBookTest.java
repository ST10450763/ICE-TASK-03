/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tivarnanaidoo
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryBookTest {

    @Test
    public void testIsAvailable() {
        LibraryBook book = new LibraryBook("Java Programming", 2, 10.00);
        assertTrue(book.isAvailable());
        
        book.borrowBook(); // Borrow one copy
        assertTrue(book.isAvailable());
        
        book.borrowBook(); // Borrow another copy
        assertFalse(book.isAvailable());
    }

    @Test
    

