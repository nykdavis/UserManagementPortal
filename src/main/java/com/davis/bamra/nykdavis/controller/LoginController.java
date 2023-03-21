package com.davis.bamra.nykdavis.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davis.bamra.nykdavis.constants.UserPortalConstants;
import com.davis.bamra.nykdavis.request.dto.GetLoginRequest;
import com.davis.bamra.nykdavis.response.dto.GetLoginResponse;
import com.davis.bamra.nykdavis.service.LoginService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(UserPortalConstants.LOGIN_PATH_PARENT)
public class LoginController {

	public static final String CUSTOM_HEADER = "api-version=1";

	@Autowired
	private LoginService loginService;

	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

	@GetMapping(path = UserPortalConstants.VALIDATE_LOGIN, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetLoginResponse> loginVarification(@Valid @RequestBody GetLoginRequest getLoginRequest,
			@RequestHeader(value = UserPortalConstants.ENTITY_USER, required = true) String entityUser) {
		LOGGER.info("Request recived to fetch all the user details.");
		GetLoginResponse getLoginResponse = loginService.validateCredentials(getLoginRequest);
		return new ResponseEntity<>(getLoginResponse, HttpStatus.OK);
	}

}
