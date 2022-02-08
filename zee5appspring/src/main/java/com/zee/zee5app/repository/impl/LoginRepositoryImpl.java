package com.zee.zee5app.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.repository.LoginRepository;

@Component
public class LoginRepositoryImpl implements LoginRepository {

	public LoginRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	DataSource dataSource;

	@Override
	public String addLogin(Login login) {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String insert = "insert into login (username, password, registerid) values(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(2, login.getPassword());
			preparedStatement.setString(3, login.getRegisterid());

			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				return "success";
			} else {
//				connection.rollback();
				return "failed1";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "failed2";
	}

}
