package com.interview.test.service;

public class SecurityService {

	public void authorize() {
		throw new IllegalStateException("Access denied");
	}

	public String getUserId(){
		return "userId";
	}
}
