package com.zee.zee5app;

import com.zee.zee5app.dto.*;
import com.zee.zee5app.service.*;
import com.zee.zee5app.repository.*;

public class main {

	public static void main(String[] args) {
		// Register
		Register register=new Register();
		register.setFirstName("Akshat");
		register.setLastName("Vedant");
		register.setEmail("akshat@gmail.com");
		register.setPassword("akshat");
		System.out.println(register);
		System.out.println(register.toString());
		System.out.println(register.getEmail());
		//Login
		Login login=new Login();
		UserService service = UserService.getInstance();
		for(int i=0;i<=11;i++) {
			Register register2=new Register();
			register2.setId("ab00"+i);
			register2.setFirstName("akshat"+i);
			register2.setLastName("vedant"+i);
			register2.setPassword("AV");	
			
		String result=service.addUser(register2);
		System.out.println(result);
		}
		
		Register register2=service.getUserById("ab1");
		System.out.println(register2!=null);
		for(Register register3:service.getUsers()) {
			System.out.println(register3);
		}
		String id="ab000";
		Register register4=new Register();
		register4.setFirstName("Vedant");
		register4.setLastName("Akshat");
		register4.setEmail("akshat@gmail.com");
		register4.setPassword("Word");
		register4.setId("v");
		Register register5=service.updateUser(id, register4);
		System.out.println(register5);
		service.deleteUser("ab006");
		
		

	}

}
