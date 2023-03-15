package com.davis.bamra.nykdavis.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginUtils {

	private static final Logger LOGGER = LogManager.getLogger(LoginUtils.class);

	public static String getEncode(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashedBytes = digest.digest(password.getBytes());
			return bytesToHex(hashedBytes);
		} catch (NoSuchAlgorithmException e) {
			// handle exception
			LOGGER.error("Error Occurs while encoading the password  {}", e);

		}
		return null;
	}

	private static String bytesToHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}

}
