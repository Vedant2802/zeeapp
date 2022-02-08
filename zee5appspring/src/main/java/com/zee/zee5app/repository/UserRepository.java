package com.zee.zee5app.repository;

import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.Register;

public interface UserRepository {
	public String addUser(Register register);

	public String updateUser(String id, Register register);

	public Optional<Register> getUserById(String id);

	public Register[] getAllUsers();

	public List<Register> getAllUsersDetails();

	public String deleteUserById(String id);
	
	public Register getUserByIdNormal(String id);
	
//	public void test();
}
