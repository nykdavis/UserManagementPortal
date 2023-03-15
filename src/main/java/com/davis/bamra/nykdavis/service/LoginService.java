package com.davis.bamra.nykdavis.service;

import com.davis.bamra.nykdavis.request.dto.GetLoginRequest;
import com.davis.bamra.nykdavis.response.dto.GetLoginResponse;

/*
 * @author Davis Nayak
 *         
 * This service is used to validate the login credentials
 */
public interface LoginService {
	
	/*
	 * 
	 * @param getLoginRequest
	 * @return GetLoginResponse
	 * 
	 */

	GetLoginResponse validateCredentials(GetLoginRequest getLoginRequest);

}
