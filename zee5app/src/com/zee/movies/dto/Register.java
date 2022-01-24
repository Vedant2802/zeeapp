package com.zee.movies.dto;

import lombok.Data;

@Data
public class Register {
	private String Name;
	private String releaseDate;
	private String[] cast;
	private String country;
	private String id;
	//EDC
	public Register() {
		System.out.println("Hello");
	}

}

