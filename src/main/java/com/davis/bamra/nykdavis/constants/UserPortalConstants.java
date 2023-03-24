package com.davis.bamra.nykdavis.constants;

public final class UserPortalConstants {

	private UserPortalConstants() {

	}

	public static final String LOGIN_PATH_PARENT = "/userManagement/login";
	public static final String VALIDATE_LOGIN = "/validate";

	public static final String REGISTRATION_PATH_PARENT = "/userManagement/user";
	public static final String GET_USERS = "/getAll";
	public static final String GET_USER = "/get/{id}";
	public static final String CREATE_USERS = "/create";
	public static final String DELETE_USER = "/delete/{id}";

	public static final String PATH_REGISTRATION = "${userPortal.registration.path}";
	public static final String ENTITY_USER = "Entity-User";

}
