package com.davis.bamra.nykdavis.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davis.bamra.nykdavis.constants.UserPortalConstants;
import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
import com.davis.bamra.nykdavis.service.UserService;

@RestController
@RequestMapping(UserPortalConstants.REGISTRATION_PATH_PARENT)
public class UserController {

	public static final String CUSTOM_HEADER = "api-version=1";

	@Autowired
	private UserService userService;

	private static final Logger LOGGER = LogManager.getLogger(UserController.class);

	@GetMapping(path = UserPortalConstants.GET_USER, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GetUserResponse>> retriveAllUser() {
		LOGGER.info("Recived retrive all the user details");
		List<GetUserResponse> allUserResponse = userService.retriveAllUser();
		return new ResponseEntity<>(allUserResponse, HttpStatus.OK);
	}

}
