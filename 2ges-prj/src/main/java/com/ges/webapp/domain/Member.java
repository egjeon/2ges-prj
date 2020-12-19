package com.ges.webapp.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Member {
	private String id;
	private String age;
	private String userName;
	private String phone;
	private Date regDate;
	
}
