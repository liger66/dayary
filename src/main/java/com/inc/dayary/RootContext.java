package com.inc.dayary;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class RootContext {
	@Bean
	public JavaMailSenderImpl javaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("liger6364@gmail.com");
		mailSender.setPassword("coppy6364");
		
		Properties props = new Properties();		
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.debug", "true");

		mailSender.setJavaMailProperties(props);
		
		return mailSender;
	}
}
