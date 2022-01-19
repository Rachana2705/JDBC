package com.xworkz.newspaper.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyDAOImpl implements CompanyDAO{

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="27051998r";
	@Override
	public void insertCompanyDetails() {
		String sqlStatement="insert into jdbc.company values(4,'Infosys','Mysore',true,10000,'A')";
		System.out.println("invoked insert details method");
		System.out.println("==============================");
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeUpdate(sqlStatement);
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
		System.out.println("========================");
		
	}

	@Override
	public void updateCompanyDetails() {
		String updateQuery="update jdbc.company set Company_Name='Tata' where cio=2";	
		System.out.println("invoked update details method");
		System.out.println("==============================");
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
		System.out.println("==============================");
	
	}

	@Override
	public void deleteCompanyDetails() {
		String deleteQuery="delete from jdbc.company where cio=1";	
		System.out.println("invoked delete details method");
		System.out.println("==============================");
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeUpdate(deleteQuery);
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
		System.out.println("==============================");

	}

	@Override
	public void DisplaySingleCompanyDetail() {
		String selectSingleRecord = "select * from company where cio = 3";	
		System.out.println("invoked display single details method");
		System.out.println("==============================");
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			 ResultSet resultset=statement.executeQuery(selectSingleRecord);
			 
			 resultset.next();
			 System.out.println(resultset.getInt(1));
			 System.out.println(resultset.getString("Company_name"));
			 System.out.println(resultset.getString(3));
			 System.out.println(resultset.getBoolean(4));
			 System.out.println(resultset.getInt(5));
			 System.out.println(resultset.getString(6));
			 
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
		System.out.println("==============================");

	}

	@Override
	public void DisplayAllCompanyDetails() {
		String selectAllRecord = "select * from company";	
		System.out.println("invoked display all details method");
		System.out.println("==============================");
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeQuery(selectAllRecord);
		    
			 ResultSet resultset=statement.executeQuery(selectAllRecord);
			 
			 while(resultset.next()) {
			 System.out.println(resultset.getInt(1));
			 System.out.println(resultset.getString("Company_name"));
			 System.out.println(resultset.getString(3));
			 System.out.println(resultset.getBoolean(4));
			 System.out.println(resultset.getInt(5));
			 System.out.println(resultset.getString(6));
			 }
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
		System.out.println("==============================");


	}

	}
}
