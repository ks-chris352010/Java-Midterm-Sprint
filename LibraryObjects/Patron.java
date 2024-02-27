package LibraryObjects;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter method for name:
    public String getName() {
        return name;
    }
    
    // Getter method for address:
    public String getAddress() {
        return address;
    }

    // Getter method for phoneNumer:
    public String getPhoneNumber() {
        return phoneNumber;

    }

    // Getter method for borrowedBooks:
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Setter method for name:
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for address:
    public void setAddress(String address) {
        this.address = address;
    }

    // Setter method for phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Setter method for borrowedBooks
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    //Method to add a borrowed book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    //Method to return a borrowed book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

}
