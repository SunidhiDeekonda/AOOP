package com.Borrowing;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        MemberRepository memberRepository = new MemberRepositoryImpl();
        BorrowingService borrowingService = new BorrowingServiceImpl(bookRepository, memberRepository);

        Book book1 = new Book("1", "1984", "George Orwell");
        Book book2 = new Book("2", "To Kill a Mockingbird", "Harper Lee");
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);

        Member member1 = new Member("1", "Alice");
        Member member2 = new Member("2", "Bob");
        memberRepository.addMember(member1);
        memberRepository.addMember(member2);

        borrowingService.borrowBook("1", "1");
        borrowingService.borrowBook("2", "2");

        System.out.println("Alice's borrowed books: " + member1.getBorrowedBooks().size());
        System.out.println("Bob's borrowed books: " + member2.getBorrowedBooks().size());

        borrowingService.returnBook("1", "1");
        System.out.println("Alice's borrowed books after returning: " + member1.getBorrowedBooks().size());
    }
}
