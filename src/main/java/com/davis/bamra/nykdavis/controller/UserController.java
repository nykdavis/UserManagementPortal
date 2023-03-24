package com.davis.bamra.nykdavis.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davis.bamra.nykdavis.constants.UserPortalConstants;
import com.davis.bamra.nykdavis.request.dto.CreateUserRequest;
import com.davis.bamra.nykdavis.response.dto.CreateUserResponse;
import com.davis.bamra.nykdavis.response.dto.DeleteUserResponse;
import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
import com.davis.bamra.nykdavis.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(UserPortalConstants.REGISTRATION_PATH_PARENT)
public class UserController {

	public static final String CUSTOM_HEADER = "api-version=1";

	@Autowired
	private UserService userService;

	private static final Logger LOGGER = LogManager.getLogger(UserController.class);

	@GetMapping(path = UserPortalConstants.GET_USERS, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GetUserResponse>> retriveAllUser() {
		LOGGER.info("Recived retrive all the user details");
		List<GetUserResponse> allUserResponse = userService.retriveAllUser();
		return new ResponseEntity<>(allUserResponse, HttpStatus.OK);
	}
	
	@GetMapping(path = UserPortalConstants.GET_USER, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetUserResponse> getUser(@PathVariable("id") int id) throws Exception{
		LOGGER.info("Recived retrive user details for id : {} ",id);
		return new ResponseEntity<>(userService.retrieveUserDetails(id),HttpStatus.OK);
	}
	
	@PostMapping(path = UserPortalConstants.CREATE_USERS, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest createUserRequest){
		return new ResponseEntity<>(userService.createUser(createUserRequest),HttpStatus.CREATED);	
	}
	
	@DeleteMapping(path = UserPortalConstants.DELETE_USER, headers = CUSTOM_HEADER, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DeleteUserResponse> deleteUser(@PathVariable("id") int id) throws Exception{
		LOGGER.info("Recived delete user details for id : {} ",id);
		return new ResponseEntity<>(userService.deleteUserDetail(id),HttpStatus.OK);		
	}
}
