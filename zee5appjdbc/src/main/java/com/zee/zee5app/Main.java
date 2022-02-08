package com.zee.zee5app;

import java.io.IOException;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.service.LoginService;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.impl.LoginServiceImpl;
import com.zee.zee5app.service.impl.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserService userService = null;
		LoginService loginService = null;
		try {
			userService = UserServiceImpl.getInstance();
			loginService = LoginServiceImpl.getInstance();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i = 1; i <= 15; i++) {
			Register register2 = new Register();
			register2.setId("sc000" + i);
			register2.setFirstName("Shashank" + i);
			register2.setLastName("Chaudhary" + i);
			register2.setEmail("shashank.chaudhary" + i + "@zee.com");
			register2.setPassword("shashank" + i + "psswd");
			String result = userService.addUser(register2);
			if (result.equals("success")) {
				Login login = new Login(register2.getEmail(), register2.getPassword(), register2.getId());
				String temp = loginService.addLogin(login);
				System.out.println("login " + temp);
			} else {
				System.out.println("register " + result);
			}
		}
//		userService.getAllUsersDetails().forEach(e -> System.out.println(e));
//
//		Register register = userService.getUserByIdNormal("sc00016");
//		System.out.println(register);
//
//		Optional<Register> temp = userService.getUserById("sc00016");
//		if (temp.isPresent())
//			System.out.println("yes");
//		else
//			System.out.println("no");
	}
}