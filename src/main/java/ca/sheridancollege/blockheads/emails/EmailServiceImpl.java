package ca.sheridancollege.blockheads.emails;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import ca.sheridancollege.blockheads.domain.RegistrationData;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class EmailServiceImpl {
	
	private JavaMailSender emailSender;
	private TemplateEngine templateEngine;
	
	public void sendDynamicMessage(String to, String companyName,
			String contactName, RegistrationData contact
			)throws MessagingException{
		
		//Prepare an evaluation context
		Context ctx = new Context();
		ctx.setVariable("companyName", companyName);
		ctx.setVariable("contactName", contactName);
		ctx.setVariable("c", contact);
		
		// Prepare message using a Spring helper
		MimeMessage mimeMessage = this.emailSender.createMimeMessage();
		MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
		
		//Set to and subject
		message.setTo(to);
		message.setSubject(companyName);
		
		//Identify the body of our email to be our thymeleaf page
		String htmlContent = this.templateEngine.process("emailTemplate.html", ctx);
		message.setText(htmlContent, true); //true = isHTML
		
		//Send the email
		this.emailSender.send(mimeMessage);
		
	}

}
