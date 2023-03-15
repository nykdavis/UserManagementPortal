package com.davis.bamra.nykdavis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "logindetails")
public class LoginDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
    private int id;
	
	@Column(name="User_Name")
    private String userName;
	
	@Column(name="Pass_Word")
    private String password;
	
	@Column(name="Is_Admin")
   private Integer isAdmin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	

}
