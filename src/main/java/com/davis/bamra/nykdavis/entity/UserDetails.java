package com.davis.bamra.nykdavis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "userdetails")
@Data
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "User_Name")
	private String userName;
	private String fullName;
	private String mobileNumber;
	private String aadharNumber;
	private String place;
	private int isMakarComittee;
	private int isMandirComittee;
	private String designation;
	private String gender;

}
