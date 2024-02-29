package LibraryObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Library} class represents a library that contains books, authors, and patrons.
 * It provides methods for searching books, borrowing and returning books, and adding books, authors, and patrons.
 */
public class Library {

    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    /**
     * Constructs a new {@code Library} with empty lists for books, authors, and patrons.
     */
    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    /**
     * Searches for books in the library by title.
     *
     * @param title The title to search for.
     * @return A list of books matching the given title.
     */
    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Searches for books in the library by author name.
     *
     * @param author The author's name to search for.
     * @return A list of books written by the given author.
     */
    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Searches for a book in the library by ISBN.
     *
     * @param ISBN The ISBN to search for.
     * @return The book with the specified ISBN, or {@code null} if not found.
     */
    public Book searchBooksByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Allows a patron to borrow a book from the library.
     *
     * @param book   The book to be borrowed.
     * @param patron The patron borrowing the book.
     */
    public void borrowBook(Book book, Patron patron) {
        book.borrowBook(patron);
    }

    /**
     * Allows a patron to return a book to the library.
     *
     * @param book   The book to be returned.
     * @param patron The patron returning the book.
     */
    public void returnBook(Book book, Patron patron) {
        book.returnBook(patron);
    }

    /**
     * Adds a book to the library's collection.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds an author to the library's collection.
     *
     * @param author The author to be added.
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Adds a patron to the library's collection.
     *
     * @param patron The patron to be added.
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
}
