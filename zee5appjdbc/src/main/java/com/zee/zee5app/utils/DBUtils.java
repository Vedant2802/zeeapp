package com.zee.zee5app.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private static Properties properties = null;

	private DBUtils() throws IOException {
		properties = this.loadProperties();
	}

	private static DBUtils dbUtils = null;

	public static DBUtils getInstance() throws IOException {
		if (dbUtils == null)
			dbUtils = new DBUtils();
		return dbUtils;
	}

	private Properties loadProperties() throws IOException {
		InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("application.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		return properties;
	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(properties.getProperty("jdbc.url"),
					properties.getProperty("jdbc.username"), properties.getProperty("jdbc.password"));
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
