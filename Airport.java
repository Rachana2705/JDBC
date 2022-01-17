package com.xworkz.newspaper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Airport {
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="27051998r";
	static String sqlStatement="insert into jdbc.airport values(4,'xyz','delhi','chennai',1,'delhi',false)";
	static String updateQuery="update jdbc.airport set startPoint='abcc' where ID=2";
	static String deleteQuery="delete from jdbc.airport where ID=1";
            

	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeUpdate(updateQuery);
			System.out.println("query is executed");
		} catch (SQLException e) {
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
		try {
			if(connection!=null) {
				connection.close();	
			}else {
				System.out.println("connection is not created");
			}

		} catch (SQLException e) {

		}

	}
	}
	}

