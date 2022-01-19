package com.xworkz.newspaper.dao;

import java.sql.*;

public class AirportDAOImpl implements AirportDAO{

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="27051998r";
	
	@Override
	public void insertAirportDetails() {
		System.out.println("invoked insert details method");
		System.out.println("==============================");
		String sqlStatement="insert into jdbc.airport values(1,'xyz','delhi','chennai',1,'delhi',false)";
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
	public void updateAirportDetails() {
		System.out.println("invoked update details method");
		System.out.println("==============================");
		String updateQuery="update jdbc.airport set Airport_name='kolkata airport' where ID=2";
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
	public void deleteAirportDetails() {
		System.out.println("invoked delete details method");
		System.out.println("==============================");
		String deleteQuery="delete from jdbc.airport where ID=4";	
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
	public void DisplaySingleAirportDetail() {
		System.out.println("invoked display single details method");
		System.out.println("==============================");
		String selectSingleRecord = "select * from airport where ID = 3";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
			 ResultSet resultset=statement.executeQuery(selectSingleRecord);
			 
			 resultset.next();
			 System.out.println(resultset.getInt(1));
			 System.out.println(resultset.getString("Airport_name"));
			 System.out.println(resultset.getString(3));
			 System.out.println(resultset.getString(4));
			 System.out.println(resultset.getInt(5));
			 System.out.println(resultset.getString(6));
			 System.out.println(resultset.getBoolean(7));
			 
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
	public void DisplayAllAirportDetails() {
		System.out.println("invoked display all details method");
		System.out.println("==============================");
		String selectAllRecord = "select * from airport";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeQuery(selectAllRecord);
		    
			 ResultSet resultset=statement.executeQuery(selectAllRecord);
			 
			 while(resultset.next()) {
			 System.out.println(resultset.getInt(1));
			 System.out.println(resultset.getString("Airport_name"));
			 System.out.println(resultset.getString(3));
			 System.out.println(resultset.getString(4));
			 System.out.println(resultset.getInt(5));
			 System.out.println(resultset.getString(6));
			 System.out.println(resultset.getBoolean(7));
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
