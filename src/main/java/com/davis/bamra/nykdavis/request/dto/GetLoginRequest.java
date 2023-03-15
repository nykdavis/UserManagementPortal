package com.davis.bamra.nykdavis.request.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GetLoginRequest {
	@NotBlank(message = "User Name can not be empty")
	private String userName;
	@NotBlank(message = "Password can not be empty")
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
