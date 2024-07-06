package com.example.library.services;

// Importing Book class from models package
import com.example.library.models.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        // add in inbuilt method of ArrayList
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) { // for(list_data_type var_name : list_name ) {...}
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
