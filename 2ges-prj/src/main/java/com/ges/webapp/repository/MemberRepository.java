package com.ges.webapp.repository;

import java.util.List;

import com.ges.webapp.domain.Member;


public interface MemberRepository {
	void join(Member member);
	List<Member> findMember();
	void removeMembers();
}
