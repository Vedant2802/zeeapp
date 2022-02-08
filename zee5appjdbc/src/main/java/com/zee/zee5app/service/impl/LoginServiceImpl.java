package com.zee.zee5app.service.impl;

import java.io.IOException;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.repository.impl.LoginRepositoryImpl;
import com.zee.zee5app.service.LoginService;

public class LoginServiceImpl implements LoginService {

	LoginRepository loginRepository = null;

	private LoginServiceImpl() throws IOException {
		loginRepository = LoginRepositoryImpl.getInstance();
	}

	private static LoginService loginService = null;

	public static LoginService getInstance() throws IOException {
		if (loginService == null)
			loginService = new LoginServiceImpl();
		return loginService;
	}

	@Override
	public String addLogin(Login login) {

		return this.loginRepository.addLogin(login);
	}

}
