package com.guru.family.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class JavaMailSenders {

	
	@Autowired
	JavaMailSender javaMailSender;
	
	
	
	public void sendMail(String toEmail,String subject,String body)
	{
		
		
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		
		
		
		mailMessage.setTo(toEmail);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		
		
		javaMailSender.send(mailMessage);
		System.out.println("mail send");
		
		
	}
	
	
	
}
