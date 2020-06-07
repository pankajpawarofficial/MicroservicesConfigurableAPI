package com.cisco.b2b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.b2b.bean.User;
import com.cisco.b2b.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@RequestMapping("/signup")
	public String signUp(){
		return "Please signup for our Service";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail() {
		
		// Send Email Here From EmailService
		User user = new User();
		user.setFirstName("Mujammil");
		user.setLastName("Khan");
		user.setEmailAddress("mujakhan@cisco.com");
		
		try {
			emailService.sendEmailService(user);
		}
		catch(MailException e)
		{
			e.printStackTrace();
		}
		
		return "Sending Email";
	}
}
