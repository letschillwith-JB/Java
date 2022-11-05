package com.masai.JdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.CollationElementIterator;

public class JdbcConnection {
	
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db3";
		
		try {
			conn = DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
