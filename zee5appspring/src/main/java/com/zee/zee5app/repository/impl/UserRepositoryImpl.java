package com.zee.zee5app.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;

@Component
public class UserRepositoryImpl implements UserRepository {

	public UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	DataSource dataSource;
	
//	public void test()
//	{
//		System.out.println(dataSource.hashCode());
//	}

	@Override
	public String addUser(Register register) {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String insert = "insert into register (regid, firstname, lastname, email, contactnumber, password) values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setString(1, register.getId());
			preparedStatement.setString(2, register.getFirstName());
			preparedStatement.setString(3, register.getLastName());
			preparedStatement.setString(4, register.getEmail());
			preparedStatement.setString(5, register.getContactNumber());
			preparedStatement.setString(6, register.getPassword());

			int result = preparedStatement.executeUpdate();
			if (result > 0)
				return "success";
			else
				return "failed";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "failed";
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
		return null;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register getUserByIdNormal(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
