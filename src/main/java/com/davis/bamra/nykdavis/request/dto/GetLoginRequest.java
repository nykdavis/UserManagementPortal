package com.davis.bamra.nykdavis.request.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GetLoginRequest {

	@NotBlank(message = "User Name can not be empty")
	private String userName;
	@NotBlank(message = "Password can not be empty")
	private String password;
}
