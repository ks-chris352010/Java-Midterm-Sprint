package LibraryObjects;

/**
 * The {@code Book} class represents a book in the library system.
 * It contains information such as title, author, ISBN, publisher, number of copies, and status.
 * The class implements the {@code Borrowable} interface.
 */
public class Book implements Borrowable {

    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private Integer numberOfCopies;
    private Status status;

    /**
     * Constructs a new {@code Book} with the specified information.
     *
     * @param title          The title of the book.
     * @param author         The author of the book.
     * @param ISBN           The International Standard Book Number (ISBN) of the book.
     * @param publisher      The publisher of the book.
     * @param numberOfCopies The number of copies available in the library.
     */
    public Book(String title, Author author, String ISBN, String publisher, Integer numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Gets the International Standard Book Number (ISBN) of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the publisher of the book.
     *
     * @return The publisher of the book.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Gets the number of copies available in the library.
     *
     * @return The number of copies available.
     */
    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * Gets the current status of the book (e.g., AVAILABLE, CHECKED_OUT).
     *
     * @return The status of the book.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return A string with the title and author of the book.
     */
    public String toString() {
        return this.title + " by " + this.author.getName();
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Sets the International Standard Book Number (ISBN) of the book.
     *
     * @param ISBN The new ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Sets the publisher of the book.
     *
     * @param publisher The new publisher of the book.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Sets the number of copies available in the library.
     *
     * @param numberOfCopies The new number of copies available.
     */
    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * Sets the status of the book.
     *
     * @param status The new status of the book.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Allows a patron to borrow the book if it is available.
     * Prints a message indicating the success or failure of the operation.
     */
    public void borrowBook() {
        if (status == Status.AVAILABLE) {
            status = Status.CHECKED_OUT;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    /**
     * Allows a patron to return the book if it is checked out.
     * Prints a message indicating the success or failure of the operation.
     */
    public void returnBook() {
        if (status == Status.CHECKED_OUT) {
            status = Status.AVAILABLE;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Cannot return a book that is not checked out.");
        }
    }
}
