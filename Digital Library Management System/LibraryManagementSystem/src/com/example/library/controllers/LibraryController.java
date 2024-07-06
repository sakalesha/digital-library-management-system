package com.example.library.controllers;

import com.example.library.models.Book;
import com.example.library.services.BookService;

public class LibraryController {
    private BookService bookService = new BookService();

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn); // calling constructor and initializing values with provided agrguments(title, author, isbn)
        // (title, author, isbn) => Book class in models file
        bookService.addBook(book); // adding book to books list in bookservice class
        System.out.println("Book added: " + book.getTitle()); // getting title from Book class
    }

    public void displayAllBooks() {
        for (Book book : bookService.getAllBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
}
