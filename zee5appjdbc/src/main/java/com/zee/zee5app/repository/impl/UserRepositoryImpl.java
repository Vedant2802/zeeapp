package com.zee.zee5app.repository.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.utils.DBUtils;

public class UserRepositoryImpl implements UserRepository {

	DBUtils dbUtils = null;

	private UserRepositoryImpl() throws IOException {
		dbUtils = DBUtils.getInstance();
	}

	private static UserRepository userRepository = null;

	public static UserRepository getInstance() throws IOException {
		if (userRepository == null)
			userRepository = new UserRepositoryImpl();
		return userRepository;
	}

	@Override
	public String addUser(Register register) {
		Connection connection = dbUtils.getConnection();
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
		} finally {
			dbUtils.closeConnection(connection);
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
