package LibraryObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Patron} class represents a library patron who can borrow and return books.
 * It stores information such as the patron's name, address, phone number, and a list of borrowed books.
 */
public class Patron {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    /**
     * Constructs a new {@code Patron} with the specified name, address, and phone number.
     *
     * @param name        The name of the patron.
     * @param address     The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Gets the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address of the patron.
     *
     * @return The address of the patron.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the patron.
     *
     * @return The phone number of the patron.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the list of books borrowed by the patron.
     *
     * @return A list of books borrowed by the patron.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Gets the list of books borrowed by the patron as a string.
     *
     * @return A list of books borrowed by the patron as a string.
     */
    public String getBorrowedBooksAsString() {
        if (borrowedBooks.isEmpty()) {
            return "No books checked out.";
        }
        StringBuilder booksString = new StringBuilder();
        for (Book book : borrowedBooks) {
            booksString.append(book.getTitle()).append(", ");
        }
        return booksString.substring(0, booksString.length() - 2);
    }

    /**
     * Sets the name of the patron.
     *
     * @param name The new name of the patron.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the address of the patron.
     *
     * @param address The new address of the patron.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the phone number of the patron.
     *
     * @param phoneNumber The new phone number of the patron.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the list of books borrowed by the patron.
     *
     * @param borrowedBooks The new list of books borrowed by the patron.
     */
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    /**
     * Adds a book to the list of books borrowed by the patron.
     *
     * @param book The book to be borrowed.
     */
    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    /**
     * Removes a book from the list of books borrowed by the patron.
     *
     * @param book The book to be returned.
     */
    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }
}
