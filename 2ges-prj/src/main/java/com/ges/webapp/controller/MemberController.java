package com.ges.webapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.annotation.ModelFactory;

import com.ges.webapp.domain.Member;
import com.ges.webapp.service.MemberService;

@Controller
public class MemberController {
	private static Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String testMethod() {
		logger.info("==========================");
		logger.info("MemberController in ROOT (MAIN) /");
		logger.info("==========================");
		
		return "members/home";
	}
	
	
	@RequestMapping(value="/members/new", method = RequestMethod.GET)
	public String joinMember() {
		logger.info("=================================================================");
		logger.info("MemberController in RequestMethod.GET /members/new");
		logger.info("=================================================================");
		
		
		return "members/createMemberForm";
	}
	
	
	@RequestMapping(value="/members/new",method = RequestMethod.POST)
	public String joinMember(Member member) {
		logger.info("=================================================================");
		logger.info("MemberController in method = RequestMethod.POST /members/new");
		logger.info("=================================================================");
		
		logger.info("# REQUEST MEMBER DATA");
		logger.info("====================================================");
		logger.info("USER NAME : " + member.getUserName());
		logger.info("USER AGE : " + member.getAge());
		logger.info("USER ADDR : " + member.getPhone());
		logger.info("====================================================");
		
		memberService.join(member);
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/members",method = RequestMethod.GET)
	public String selectUser(Model model) {
		logger.info("=================================================================");
		logger.info(" MemberController in method = RequestMethod.POST /members");
		logger.info("=================================================================");
		
		List<Member> members = memberService.findMember();
		
		logger.info(members.toString());
		
		model.addAttribute("members",members);
		
		return "members/memberList";
	}
	
	@RequestMapping(value="/members/clear",method = RequestMethod.GET)
	public String memberClear() {
		logger.info("=================================================================");
		logger.info(" MemberController in method = RequestMethod.POST /members/clear");
		logger.info("=================================================================");
		
		memberService.removeMembers();
		
		return "redirect:/";
	}
}
