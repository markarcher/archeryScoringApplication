package com.archeryScoringApp.mark.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="user")
@Entity
public class User {
	private String userName;
	private String password;
	private String role;
	private int userId;

	
	public User() {
				
	}

	public User(String userName, String password, String role) {
		
		this.userName = userName;
		this.password = password;
		this.role = role;
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userId")
	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}
    @Column(name="userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRole(String role){
		this.role= role;
	}
	@Column(name="role")
	public String getRole(){
		return role;
	}

}
