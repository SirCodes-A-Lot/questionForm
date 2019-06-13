package com.quiz.login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginController {
	
	public boolean login(String username, String password) throws NoSuchAlgorithmException {
		String encryptedPassword = encryptString(password);
		return (encryptedPassword.equals(getPassword()) );
	}
	
	private String getPassword() {
		String storedPassword = encryptString("password");
		return storedPassword;
	}
	
	private String encryptString(String unencryptedString) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(unencryptedString.getBytes());
			return new String (messageDigest.digest());
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
