package com.inc.dayary.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Member {
	@Pattern(regexp="[A-Za-z0-9]{4,10}", message="알파벳 과 숫자로 4 ~10 글자로 입력 합니다")
	private String id;
	@Pattern(regexp="[A-Za-z0-9!@#$%^&*()]{4,10}", message="알파벳 과 숫자 4 ~10 글자로 입력 합니다")
	private String password;
	private String passwordConfirm;
	@Pattern(regexp="[A-Za-z가-힣]{2,10}", message="알파벳 과 숫자 2 ~10 글자로 입력 합니다")
	private String name; 
	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]{2,10}", message="잘못된 이메일 형식입니다.")
	private String email;
	private String emailCode;
	@NotEmpty(message="성별을 선택해 주세요")
	@Pattern(regexp="[fm]", message="잘못된 선택")
	private String gender;
	
	public String getEmailCode() {
		return emailCode;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	
	public String getId() {
		return id;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isPasswordValid() {		
		return this.password.equals(this.passwordConfirm);
	}
}
