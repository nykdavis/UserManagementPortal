package com.davis.bamra.nykdavis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
    private int id;
	
	@Column(name="User_Name")
    private String userName;
	
	private String fullName;
	
	private String mobileNumber;
	
	private String aadharNumber;
	
	private String place;
	
	private int isMakarComittee;
	
	private int isMandirComittee;
	
	private String designation;
	
	private String gender;

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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getIsMakarComittee() {
		return isMakarComittee;
	}

	public void setIsMakarComittee(int isMakarComittee) {
		this.isMakarComittee = isMakarComittee;
	}

	public int getIsMandirComittee() {
		return isMandirComittee;
	}

	public void setIsMandirComittee(int isMandirComittee) {
		this.isMandirComittee = isMandirComittee;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
