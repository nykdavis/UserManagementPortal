package com.davis.bamra.nykdavis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.bamra.nykdavis.entity.UserDetails;
import com.davis.bamra.nykdavis.repository.UserRepository;
import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
import com.davis.bamra.nykdavis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

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

}
