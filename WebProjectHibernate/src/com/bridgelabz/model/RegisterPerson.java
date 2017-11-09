package com.bridgelabz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Persons")
public class RegisterPerson{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int ID;
	@Column(name="firstNAme")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String password;
	
	@Column(name="birthday")
	private String birth;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="recoverEmail")
	private String remail;
	
	@Column(name="location")
	private String location;
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getBirth() {
		return birth;
	}

	public String getMobile() {
		return mobile;
	}

	public String getRemail() {
		return remail;
	}

	public String getLocation() {
		return location;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

}
