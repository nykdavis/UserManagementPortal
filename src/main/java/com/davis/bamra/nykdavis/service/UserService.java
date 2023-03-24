package com.davis.bamra.nykdavis.service;

import java.util.List;

import com.davis.bamra.nykdavis.request.dto.CreateUserRequest;
import com.davis.bamra.nykdavis.response.dto.CreateUserResponse;
import com.davis.bamra.nykdavis.response.dto.DeleteUserResponse;
import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
/*
 * @author Davis Nayak
 *         
 * This service is used to maintain the user details.
 */

import jakarta.validation.Valid;

public interface UserService {
	/*
	 * 
	 * @return List<GetLoginResponse>
	 * 
	 */
	
	List<GetUserResponse> retriveAllUser();
	/*
	 * @param CreateUserRequest
	 * @return List<GetLoginResponse>
	 * 
	 */
	CreateUserResponse createUser(@Valid CreateUserRequest createUserRequest);
	/*
	 * @param id
	 * @return GetLoginResponse
	 * 
	 */
	GetUserResponse retrieveUserDetails(int id) throws Exception;
	/*
	 * @param id
	 * @return DeleteUserResponse
	 * 
	 */
	DeleteUserResponse deleteUserDetail(int id) throws Exception;

}
