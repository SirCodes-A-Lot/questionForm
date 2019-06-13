package com.quiz.login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.NoSuchAlgorithmException;

import org.junit.Before;
import org.junit.Test;

public class LoginControllerTest {
	
	private LoginController loginController;
	
	@Before
	public void setup () {
		loginController = new LoginController();
	}

	@Test
	public void givenPasswordProvidedWhenLoggingInThenReturnTrue() throws NoSuchAlgorithmException {
		assertTrue(loginController.login("", "password"));
		assertFalse(loginController.login("", "pasord"));
	}
	
}
