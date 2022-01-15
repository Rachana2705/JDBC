package com.xworkz.newspaper;

import java.sql.*;

public class Tester {

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="27051998r";
	static String sqlStatement="insert into jdbc.newspaper values(2,'Tamil','The Hindu',60)";
	
	public static void main(String[] args) throws Exception {
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();
		statement.executeUpdate(sqlStatement);
		System.out.println("query is executed");
	}
}
