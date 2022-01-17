package com.xworkz.newspaper;

import java.sql.*;

import com.mysql.cj.xdevapi.SqlStatement;


public class Company {
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="27051998r";
	static String sqlStatement="insert into jdbc.company values(4,'Infosys','Mysore',true,10000,'A')";
	static String updateQuery="update jdbc.company set Company_Name='BMW' where cio=2";
	static String deleteQuery="delete from jdbc.company where cio=1";
            
	public static void main(String[] args) throws Exception {

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
