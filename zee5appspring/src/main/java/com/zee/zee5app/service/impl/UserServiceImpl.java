package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	DataSource dataSource;
	
//	public void test2() {
//		System.out.println(dataSource.hashCode());
//	}

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
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
