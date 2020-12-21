package com.ges.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebSocketController {

	@RequestMapping(value ="/websocket/client" , method = RequestMethod.GET)
	public String websocketClient() {
		
		return "websocket/chatForm";
	}
}
