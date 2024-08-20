package com.Borrowing;

public interface BookRepository {
    void addBook(Book book);
    Book getBookById(String id);
}
