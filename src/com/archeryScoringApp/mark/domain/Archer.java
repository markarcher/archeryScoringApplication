package com.archeryScoringApp.mark.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="archer")
@Entity
public class Archer {
	
	private String lname;
	private String fname;
	private String emailAddress;
	private String contactNumber;
	private int archerId;
	private String club;
	
	public Archer() {
		
	}
	

	public Archer(String lname, String fname, String emailAddress, String contactNumber, String club){
		this.lname = lname;
		this.fname = fname;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.club = club;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "archerId")
	public int getArcherId() {
		return archerId;
	}

	public void setArcherId(int archerId) {
		this.archerId = archerId;
	}
	
	@Column(name = "lname")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "fname")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "contactNumber")
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "club")
	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
}
