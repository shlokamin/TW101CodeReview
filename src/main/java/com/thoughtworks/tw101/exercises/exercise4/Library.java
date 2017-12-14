package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        // prints out all books in Library whose title contains the string passed in
        String booksContaining = "";

        for (int i = 0; i < books.length; i++) {
            if (books[i].toLowerCase().contains(partialBookTitle.toLowerCase())) {
                booksContaining += books[i] + ", ";
            }
        }

        if (booksContaining.length() == 0) {
            printStream.printf("There are no book titles in the library containing the word '%s'.%n", partialBookTitle);
        }

        else {
            printStream.printf("Books in library containing '%s': %s%n", partialBookTitle,
                    booksContaining.substring(0, booksContaining.length() - 2));

        }
    }
}
