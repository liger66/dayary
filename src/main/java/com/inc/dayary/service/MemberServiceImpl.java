package com.inc.dayary.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.inc.dayary.domain.Member;
import com.inc.dayary.repository.MemberDao;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private JavaMailSender javaMailsender;

	@Override
	public Member fineOne(String id) {
		Member member = memberDao.findOne(id);
		return member;
	}

	@Override
	public boolean emailDupCheck(String email) {
		Member member = memberDao.getfindOneByEmail(email);
		return member != null;
	}

	@Override
	public String sendCertifyEmail(String email) {
		String from = "liger6364@gmail.com";
		String subject = "Dayary email verify";
		
		String emailCode = makeRandomCode();
		String content = "인증코드 : " + emailCode;
		
		try {
			MimeMessage msg = javaMailsender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
			helper.setFrom(from);
			helper.setTo(email);
			helper.setSubject(subject);
			helper.setText(content);
			
			javaMailsender.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return emailCode;
	}
	
	public String makeRandomCode() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			sb.append( (int)(Math.random() * 10) );
		}
		return sb.toString();
	}

	@Override
	public void signup(Member member) {
		memberDao.signup(member);
		
	}
}
