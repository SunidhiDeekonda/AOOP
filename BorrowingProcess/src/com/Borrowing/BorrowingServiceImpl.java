package com.Borrowing;

public class BorrowingServiceImpl implements BorrowingService {
    private BookRepository bookRepository;
    private MemberRepository memberRepository;

    public BorrowingServiceImpl(BookRepository bookRepository, MemberRepository memberRepository) {
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void borrowBook(String memberId, String bookId) {
        Member member = memberRepository.getMemberById(memberId);
        Book book = bookRepository.getBookById(bookId);
        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            book.setAvailable(false);
        }
    }

    @Override
    public void returnBook(String memberId, String bookId) {
        Member member = memberRepository.getMemberById(memberId);
        Book book = bookRepository.getBookById(bookId);
        if (member != null && book != null) {
            member.returnBook(book);
            book.setAvailable(true);
        }
    }
}

