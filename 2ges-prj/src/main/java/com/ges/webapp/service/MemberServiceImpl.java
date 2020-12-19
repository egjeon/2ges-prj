package com.ges.webapp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ges.webapp.domain.Member;
import com.ges.webapp.repository.MemberRepository;
import com.ges.webapp.util.GesUtil;


@Service
public class MemberServiceImpl implements MemberService{
	
	private static Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private MemberRepository memberRepository;
	@Override
	public void join(Member member) {
		
		try {
			memberRepository.join(member);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}

	@Override
	public List<Member> findMember() {
		List<Member> result = new ArrayList<Member>();
		try {
			 result =  memberRepository.findMember();
			 if(result.size() > 0) {
				 for(int i = 0; i < result.size(); i++) {
					 result.get(i).setPhone(GesUtil.getInstance().addHyphen(result.get(i).getPhone()));
				 }
			 }
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return result;
	}

	@Override
	public void removeMembers() {
		try {
			memberRepository.removeMembers();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}
	
}
