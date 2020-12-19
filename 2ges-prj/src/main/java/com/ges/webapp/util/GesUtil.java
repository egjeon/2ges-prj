package com.ges.webapp.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GesUtil {
	
	private static GesUtil instance = new GesUtil();
	private static Logger logger = LoggerFactory.getLogger(GesUtil.class);
	private GesUtil() {
		
	}
	
	public static GesUtil getInstance() {
		if(instance == null) {
			instance = new GesUtil();
		}
		return instance;
	}
	
	public String addHyphen(String value) {
		String first = "";
		String mid = "";
		String last = "";
		try {
				first = value.substring(0,3);
				mid = value.substring(first.length(),value.length()-4);
				last = value.substring(first.length() + mid.length(),value.length());
				value = first+"-"+mid+"-"+last;
			
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return value;
		
	}

	
}
