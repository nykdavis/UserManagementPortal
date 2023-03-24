package com.davis.bamra.nykdavis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "logindetails")
@Data
public class LoginDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "Pass_Word")
	private String password;

	@Column(name = "Is_Admin")
	private Integer isAdmin;

}
