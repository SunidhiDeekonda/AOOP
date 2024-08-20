package com.Authentication;

public class UserAuthentication {
	    private static UserAuthentication instance;
	    private boolean authenticated;

	    private UserAuthentication() {
	        authenticated = false;
	    }

	    public static UserAuthentication getInstance() {
	        if (instance == null) {
	            instance = new UserAuthentication();
	        }
	        return instance;
	    }

	    public void login() {
	        authenticated = true;
	        System.out.println("User logged in.");
	    }

	    public void logout() {
	        authenticated = false;
	        System.out.println("User logged out.");
	    }

	    public boolean isAuthenticated() {
	        return authenticated;
	    }

}
