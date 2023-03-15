package com.davis.bamra.nykdavis.response.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetLoginResponse {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
