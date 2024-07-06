package com.example.library;

import com.example.library.controllers.LibraryController;

public class Main {
    public static void main(String[] args) {
        LibraryController controller = new LibraryController();
        controller.addBook("Effective Java", "Joshua Bloch", "978-0134685991");
        controller.addBook("Clean Code", "Robert C. Martin", "978-0132350884");
        controller.displayAllBooks();
    }
}
