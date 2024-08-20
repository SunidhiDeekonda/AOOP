package com.Borrowing;

public class Borrowing {
    private Member member;
    private Book book;

    public Borrowing(Member member, Book book) {
        this.member = member;
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }
}
