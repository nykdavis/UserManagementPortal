package com.davis.bamra.nykdavis.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.bamra.nykdavis.entity.LoginDetails;
import com.davis.bamra.nykdavis.repository.LoginRepository;
import com.davis.bamra.nykdavis.request.dto.GetLoginRequest;
import com.davis.bamra.nykdavis.response.dto.GetLoginResponse;
import com.davis.bamra.nykdavis.service.LoginService;
import com.davis.bamra.nykdavis.util.LoginUtils;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public GetLoginResponse validateCredentials(GetLoginRequest getLoginRequest) {
		LoginDetails loginDetails = loginRepository.findByUserName(getLoginRequest.getUserName());
		final String requestPassword = LoginUtils.getEncode(getLoginRequest.getPassword());
		return validate(requestPassword, loginDetails.getPassword());

	}

	private GetLoginResponse validate(String requestPassword, String responsePassword) {
		GetLoginResponse loginResponse = new GetLoginResponse();
		loginResponse.setMessage(Boolean.toString(Objects.equals(requestPassword, responsePassword)));
		return loginResponse;
	}

}
