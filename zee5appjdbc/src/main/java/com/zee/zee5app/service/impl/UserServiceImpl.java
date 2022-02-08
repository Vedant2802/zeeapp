package com.zee.zee5app.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.repository.impl.UserRepositoryImpl;
import com.zee.zee5app.service.UserService;

public class UserServiceImpl implements UserService {

	UserRepository userRepository = null;

	private UserServiceImpl() throws IOException {
		userRepository = UserRepositoryImpl.getInstance();
	}

	private static UserService userService = null;

	public static UserService getInstance() throws IOException {
		if (userService == null)
			userService = new UserServiceImpl();
		return userService;
	}

	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		return this.userRepository.addUser(register);
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Register> getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register[] getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Register> getAllUsersDetails() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsersDetails();
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register getUserByIdNormal(String id) {
		// TODO Auto-generated method stub
		return this.userRepository.getUserByIdNormal(id);
	}

}
