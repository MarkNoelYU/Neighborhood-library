package com.pluralsight;

public class Neighborhood {
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book();

        // Display book details
        book.displayBookInfo();

        // Check out the book
        book.checkOut();

        // Try checking out the book again (should fail)
        book.checkOut();

        // Return the book
        book.returnBook();

        // Display book details after returning
        book.displayBookInfo();
    }
}
