package com.ges.webapp.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ges.webapp.domain.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository{
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAME_SPACE = "com.ges.webapp.mapper.Member.";
	
	@Override
	public void join(Member member) {
		sqlSession.insert(NAME_SPACE + "insertMember",member);
	}

	@Override
	public List<Member> findMember() {
		return sqlSession.selectList(NAME_SPACE +"selectMember");
	}

	@Override
	public void removeMembers() {
		sqlSession.delete(NAME_SPACE + "deleteMember");
	}

}
