package com.zee.zee5app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.service.LoginService;

@Component
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addLogin(Login login) {

		return this.loginRepository.addLogin(login);
	}

}
