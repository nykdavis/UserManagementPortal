package com.davis.bamra.nykdavis.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davis.bamra.nykdavis.constants.UserPortalConstants;

@RestController
@RequestMapping(UserPortalConstants.REGISTRATION_PATH_PARENT)
public class UserController {
	
	public static final String CUSTOM_HEADER = "api-version=1";
	
	
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);
	
	@GetMapping(path=UserPortalConstants.GET_USER, headers = CUSTOM_HEADER, produces=MediaType.APPLICATION_JSON_VALUE)

}
