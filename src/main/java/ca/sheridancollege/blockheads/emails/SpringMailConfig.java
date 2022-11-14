package ca.sheridancollege.blockheads.emails;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class SpringMailConfig {
	
	//Creates the connection into our gmail account
	@Bean
	public JavaMailSender getJavaMailSender() {
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
		//Identify the email server
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		
		//Connect to that email
		mailSender.setUsername("lastkyc@gmail.com");
		mailSender.setPassword("hlqaajtpdltzjtrw");
		
		//Setup the properties for that connection
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true"); 
		
		return mailSender;
	}

}
