package com.davis.bamra.nykdavis.response.dto;

import lombok.Data;

@Data
public class GetUserResponse {

	private int id;
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
