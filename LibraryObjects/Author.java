package LibraryObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The {@code Author} class represents an author in the library system.
 * It stores information such as the author's name, date of birth, and a list of books written.
 */
public class Author {

    private String name;
    private Date dateOfBirth;
    private Book[] booksWritten;

    /**
     * Constructs a new {@code Author} with the specified information.
     *
     * @param name         The name of the author.
     * @param dateOfBirth  The date of birth of the author.
     * @param booksWritten An array of books written by the author.
     */
    public Author(String name, Date dateOfBirth, Book[] booksWritten) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = booksWritten;
    }

    /**
     * Gets the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the date of birth of the author.
     *
     * @return The date of birth of the author.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Gets the array of books written by the author.
     *
     * @return An array of books written by the author.
     */
    public Book[] getBooksWritten() {
        return booksWritten;
    }

    /**
     * Returns a string representation of the author.
     *
     * @return A string containing the name and date of birth of the author.
     */
    public String toString() {
        return this.name + " | " + this.getDateOfBirthAsString();
    }

    /**
     * Gets the date of birth of the author as a formatted string.
     *
     * @return The date of birth as a formatted string (yyyy-MM-dd).
     */
    public String getDateOfBirthAsString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(dateOfBirth);
    }

    /**
     * Gets a string representation of the books written by the author.
     *
     * @return A string containing the titles of books written by the author.
     */
    public String getBooksWrittenAsString() {
        if (booksWritten == null || booksWritten.length == 0) {
            return "No books written.";
        }
        StringBuilder booksString = new StringBuilder();
        for (Book book : booksWritten) {
            booksString.append(book.getTitle()).append(", ");
        }
        return booksString.substring(0, booksString.length() - 2);
    }

    /**
     * Sets the name of the author.
     *
     * @param name The new name of the author.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the date of birth of the author.
     *
     * @param dateOfBirth The new date of birth of the author.
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Adds a book to the list of books written by the author.
     *
     * @param book The book to be added to the author's list of books.
     */
    public void addBook(Book book) {
        if (booksWritten == null) {
            booksWritten = new Book[]{book};
        } else {
            Book[] newBooksArray = new Book[booksWritten.length + 1];
            System.arraycopy(booksWritten, 0, newBooksArray, 0, booksWritten.length);
            newBooksArray[booksWritten.length] = book;
            booksWritten = newBooksArray;
        }
    }
}
