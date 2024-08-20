package com.Borrowing;

import java.util.HashMap;
import java.util.Map;

public class MemberRepositoryImpl implements MemberRepository {
    private Map<String, Member> members = new HashMap<>();

    @Override
    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public Member getMemberById(String id) {
        return members.get(id);
    }
}

