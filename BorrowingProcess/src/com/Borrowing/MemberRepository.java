package com.Borrowing;

public interface MemberRepository {
    void addMember(Member member);
    Member getMemberById(String id);
}
