package com.bridgelabz.controller;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*; 
/**
 * 
 * @author shritej
 * @version 1.0
 * @since 3-11-2017
 *
 */
class Mailer{ 
	/**
	 * declaration
	 */
	public static String from="shritejmayekar69@gmail.com";
	public static void send(String to,String sub,String msg){  
		
		Properties props = new Properties();    
		props.put("mail.smtp.host", "smtp.gmail.com");    
		props.put("mail.smtp.socketFactory.port", "465");    
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
		props.put("mail.smtp.auth", "true");    
		props.put("mail.smtp.port", "465");    
		
		
		
		
		String password="8793895204";
		Session session = Session.getDefaultInstance(props,    
				new javax.mail.Authenticator() {    
			protected PasswordAuthentication getPasswordAuthentication() {    
				return new PasswordAuthentication(from,password);  
			}    
		});    
		
		try {    
			MimeMessage message = new MimeMessage(session);    
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
			message.setSubject(sub);    
			message.setText(msg);    
			
			Transport.send(message);    
			System.out.println("message sent successfully");    
		} catch (MessagingException e) {throw new RuntimeException(e);}    

	}  
}  



