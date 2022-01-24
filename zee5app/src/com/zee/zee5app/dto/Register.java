package com.zee.zee5app.dto;

import lombok.Data;

@Data

public class Register {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String id;
	//EDC
	public Register() {
		System.out.println("Hello");
	}

}

