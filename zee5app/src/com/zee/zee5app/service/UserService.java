package com.zee.zee5app.service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
public class UserService {
	private UserRepository repository=UserRepository.getInstance();
	//service is consuming the repository
	
	private UserService() {
		// TODO Auto-generated constructor stub
	}
	private static UserService service=null;
	public static UserService getInstance() {
		if (service==null)
			service=new UserService();
		return(service);
		
	}
	public String addUser(Register register) {
		return this.repository.addUser(register);
		
	}
	public Register getUserById(String id) {
		return repository.getUserById(id);
	}
	public Register updateUser(String id, Register register) {
		return repository.updateUser(id, register);
	}
	public void deleteUser(String id) {
		repository.deleteUser(id);
	}
	public Register[] getUsers() {
		return repository.getUsers();
	}
	

}

