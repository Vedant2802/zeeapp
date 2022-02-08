package com.zee.zee5app.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
public class Register {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String contactNumber;

	public Register(String id, String firstName, String lastName, String email, String password, String contactNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
	}

}