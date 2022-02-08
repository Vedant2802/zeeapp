package com.zee.zee5app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.zee.zee5app.config.Config;
import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.LoginService;
import com.zee.zee5app.service.UserService;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		UserService userService = applicationContext.getBean(UserService.class);
		LoginService loginService = applicationContext.getBean(LoginService.class);

//		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//		
//		userService.test2();
//		userRepository.test();

//		for (int i = 1; i <= 15; i++) {
//			Register register2 = new Register();
//			register2.setId("sc000" + i);
//			register2.setFirstName("Shashank" + i);
//			register2.setLastName("Chaudhary" + i);
//			register2.setEmail("shashank.chaudhary" + i + "@zee.com");
//			register2.setPassword("shashank" + i + "psswd");
//			String result = userService.addUser(register2);
//			if (result.equals("success")) {
//				Login login = new Login(register2.getEmail(), register2.getPassword(), register2.getId());
//				String temp = loginService.addLogin(login);
//				System.out.println("login " + temp);
//			} else {
//				System.out.println("register " + result);
//			}
//		}

		applicationContext.close();
	}
}