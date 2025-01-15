package Day6Questions;

import java.util.ArrayList;
//1. Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object.
// Create an ArrayList of type Book and store all book objects into collections and display all book details.
// [Hint:Use advanced for loop to display all Books details]

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized Constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter method to display book details
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding book objects to the ArrayList
        bookList.add(new Book(1, "1984", "George Orwell"));
        bookList.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Display all book details using advanced for loop
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
