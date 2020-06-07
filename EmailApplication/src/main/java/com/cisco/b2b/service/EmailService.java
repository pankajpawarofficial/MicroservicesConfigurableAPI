package com.cisco.b2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cisco.b2b.bean.User;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	

	public void sendEmailService(User user) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("mujakhan@cisco.com");
		mail.setFrom("mujakhan@cisco.com");
		mail.setSubject("test");
		mail.setText("Test Email");
		
		javaMailSender.send(mail);
	}

}
