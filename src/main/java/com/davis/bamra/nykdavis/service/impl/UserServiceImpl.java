package com.davis.bamra.nykdavis.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.bamra.nykdavis.entity.UserDetails;
import com.davis.bamra.nykdavis.repository.UserRepository;
import com.davis.bamra.nykdavis.request.dto.CreateUserRequest;
import com.davis.bamra.nykdavis.response.dto.CreateUserResponse;
import com.davis.bamra.nykdavis.response.dto.DeleteUserResponse;
import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
import com.davis.bamra.nykdavis.service.UserService;

import jakarta.validation.Valid;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<GetUserResponse> retriveAllUser() {

		List<UserDetails> allUsers = userRepository.findAll();
		return allUsers.stream().map(userDetails -> {
			GetUserResponse response = new GetUserResponse();
			response.setId(userDetails.getId());
			response.setUserName(userDetails.getUserName());
			response.setFullName(userDetails.getFullName());
			response.setMobileNumber(userDetails.getMobileNumber());
			response.setAadharNumber(userDetails.getAadharNumber());
			response.setPlace(userDetails.getPlace());
			response.setIsMakarComittee(userDetails.getIsMakarComittee());
			response.setIsMandirComittee(userDetails.getIsMandirComittee());
			response.setDesignation(userDetails.getDesignation());
			response.setGender(userDetails.getGender());
			return response;
		}).toList();

	}

	@Override
	public CreateUserResponse createUser(@Valid CreateUserRequest createUserRequest) {
		UserDetails userDetails = userRepository.save(mapToUserDetails(createUserRequest));
		return mapToCreateUserResponse(userDetails);
	}

	private UserDetails mapToUserDetails(CreateUserRequest createUserRequest) {
		return Optional.ofNullable(createUserRequest).map(request -> {
			UserDetails userDetails = new UserDetails();
			userDetails.setUserName(request.getUserName());
			userDetails.setFullName(request.getFullName());
			userDetails.setMobileNumber(request.getMobileNumber());
			userDetails.setAadharNumber(request.getAadharNumber());
			userDetails.setPlace(request.getPlace());
			userDetails.setIsMakarComittee(request.getIsMakarComittee());
			userDetails.setIsMandirComittee(request.getIsMandirComittee());
			userDetails.setDesignation(request.getDesignation());
			userDetails.setGender(request.getGender());
			return userDetails;
		}).orElse(null);
	}

	private CreateUserResponse mapToCreateUserResponse(UserDetails userDetails) {
		return Optional.ofNullable(userDetails).map(user -> {
			CreateUserResponse response = new CreateUserResponse();
			response.setMesssage("SUCCESS");
			response.setUserName(user.getUserName());
			response.setId(user.getId());
			return response;
		}).orElse(null);
	}

	@Override
	public GetUserResponse retrieveUserDetails(int id) throws Exception {
		Optional<UserDetails> userOptional = userRepository.findById(id);
		UserDetails userDetails = userOptional.orElseThrow(() -> new Exception("No User found with ID " + id));
		return mapUserDetailsToResponse(userDetails);
	}

	private GetUserResponse mapUserDetailsToResponse(UserDetails userDetails) {
		GetUserResponse response = new GetUserResponse();
		response.setId(userDetails.getId());
		response.setUserName(userDetails.getUserName());
		response.setFullName(userDetails.getFullName());
		response.setMobileNumber(userDetails.getMobileNumber());
		response.setAadharNumber(userDetails.getAadharNumber());
		response.setPlace(userDetails.getPlace());
		response.setIsMakarComittee(userDetails.getIsMakarComittee());
		response.setIsMandirComittee(userDetails.getIsMandirComittee());
		response.setDesignation(userDetails.getDesignation());
		response.setGender(userDetails.getGender());
		return response;
	}

	@Override
	public DeleteUserResponse deleteUserDetail(int id) throws Exception {
		DeleteUserResponse deleteUserResponse = new DeleteUserResponse();
		try {
			userRepository.deleteById(id);
			deleteUserResponse.setId(id);
			deleteUserResponse.setMessage("DELETE SUCCESS");
		} catch (Exception e) {
			LOGGER.error("Deletion faild for the user {}", id);
		}
		return deleteUserResponse;
	}

}
