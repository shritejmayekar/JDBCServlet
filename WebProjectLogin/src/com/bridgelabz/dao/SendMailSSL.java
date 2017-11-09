package com.bridgelabz.dao;
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
public class SendMailSSL{ 
	/**
	 * declaration
	 */
	public static String from="shritejmayekar69@gmail.com";
	public void send(String to,String sub,String msg){  
		//Get properties object 
		String password="8793895204";
		Properties props = new Properties();    
		props.put("mail.smtp.host", "smtp.gmail.com");    
		props.put("mail.smtp.socketFactory.port", "465");    
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
		props.put("mail.smtp.auth", "true");    
		props.put("mail.smtp.port", "465");    
		
		
		
		//get Session   
		
		Session session = Session.getDefaultInstance(props,    
				new javax.mail.Authenticator() {    
			protected PasswordAuthentication getPasswordAuthentication() {    
				return new PasswordAuthentication(from,password);  
			}    
		});    
		//compose message    
		try {    
			MimeMessage message = new MimeMessage(session);    
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
			message.setSubject(sub);    
			message.setText(msg);    
			//send message  
			Transport.send(message);    
			//System.out.println("message sent successfully");   
			
		} catch (MessagingException e) {throw new RuntimeException(e);}    
		
	}  
}  



