package com.pluralsight;

public class Book {
    // Attributes
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false; // initially, the book is not checked out
        this.checkedOutTo = null;  // no one has checked out the book
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Method to check out the book
    public void checkOut(String personName) {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            this.checkedOutTo = personName;
            System.out.println("com.pluralsight.Book \"" + title + "\" checked out to " + personName + ".");
        } else {
            System.out.println("com.pluralsight.Book \"" + title + "\" is already checked out to " + checkedOutTo + ".");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (isCheckedOut) {
            System.out.println("com.pluralsight.Book \"" + title + "\" returned by " + checkedOutTo + ".");
            this.isCheckedOut = false;
            this.checkedOutTo = null;
        } else {
            System.out.println("com.pluralsight.Book \"" + title + "\" was not checked out.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("ID: " + id);
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes, to " + checkedOutTo : "No"));
    }

}