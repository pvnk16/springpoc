package com.spring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class SimpleMailSender {

	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;
	
	@Autowired
	private SimpleMailMessage simpleMailMessage;
	

	public void sendMail() {


		SimpleMailMessage msg = new SimpleMailMessage(this.simpleMailMessage);
        
		msg.setTo("jhon@gmail.com");
        msg.setText(
            "Dear Pavan,"
                + ", thank you for placing order. Your order number is "
                +" order.getOrderNumber())");
        try{
            this.javaMailSenderImpl.send(msg);
        }
        catch (MailException ex) {
            System.err.println(ex.getMessage());
        }
		
	}

}
