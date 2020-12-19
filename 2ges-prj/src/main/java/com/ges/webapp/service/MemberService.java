package com.ges.webapp.service;

import java.util.List;

import com.ges.webapp.domain.Member;


public interface MemberService {

	void join(Member member);
	List<Member> findMember();
	void removeMembers();
	
}
