package com.fdmgroup.mockitologin;

public class User {
	private String	username;
	private String	password;
	private boolean	loggedIn;

	public User(String username, String password) {

		this.username = username;
		this.password = password;
		loggedIn = false;
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {

		this.username = username;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public boolean isLoggedIn() {

		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {

		this.loggedIn = loggedIn;
	}

}

