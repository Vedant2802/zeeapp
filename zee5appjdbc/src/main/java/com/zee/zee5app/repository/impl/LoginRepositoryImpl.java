package com.zee.zee5app.repository.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.utils.DBUtils;

public class LoginRepositoryImpl implements LoginRepository {

	private static DBUtils dbUtils = null;

	private LoginRepositoryImpl() throws IOException {
		dbUtils = DBUtils.getInstance();
	}

	private static LoginRepository loginRepository = null;

	public static LoginRepository getInstance() throws IOException {
		if (loginRepository == null)
			loginRepository = new LoginRepositoryImpl();
		return loginRepository;
	}

	@Override
	public String addLogin(Login login) {
		Connection connection = dbUtils.getConnection();
		String insert = "insert into login (username, password, registerid) values(?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(2, login.getPassword());
			preparedStatement.setString(3, login.getRegisterid());

			int result = preparedStatement.executeUpdate();
			if (result > 0) {
				connection.commit();
				return "success";
			} else {
				connection.rollback();
				return "failed1";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		return "failed2";
	}

}
