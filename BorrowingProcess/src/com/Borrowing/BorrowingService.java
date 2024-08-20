package com.Borrowing;

public interface BorrowingService {
    void borrowBook(String memberId, String bookId);
    void returnBook(String memberId, String bookId);
}
