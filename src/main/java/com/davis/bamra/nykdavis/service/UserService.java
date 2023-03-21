package com.davis.bamra.nykdavis.service;

import java.util.List;

import com.davis.bamra.nykdavis.response.dto.GetUserResponse;
/*
 * @author Davis Nayak
 *         
 * This service is used to maintain the user details.
 */

public interface UserService {
	/*
	 * 
	 * @return List<GetLoginResponse>
	 * 
	 */
	
	List<GetUserResponse> retriveAllUser();

}
