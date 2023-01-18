/** 
 * Please Go to application , in use user name and password then program run ,Thanks. 
 * 
 * @author Raj_Kumar_Mali
 * **/

package com.Spring_boot_Email_Sending;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.Spring_boot_Email_Sending.service.EmailSenderService;

@SpringBootApplication
public class SpringBootEmailSendingApplication {

	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailSendingApplication.class, args);
	}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail()throws MessagingException {
			//service.sendSimpleEmail("raj19cse07@gmail.com", "This is the Email Body...." ,"This is the Email Subject");
			
			service.sendEmailWithAttachment("mahivijaykumarray007@gmail.com", "This mail Body with Attachment Raj Kumar Pic...", "This email has attachment Raj Kumar Mali", "C:\\Users\\User\\Pictures\\photo1\\photo\\photo\\RAJ PIC1 - Copy.jpg");
			
	}

}
