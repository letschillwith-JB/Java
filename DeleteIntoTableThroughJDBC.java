package Assign_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteIntoTableThroughJDBC {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101_db";
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DriverManager.getConnection(url,"root","root");
			
			PreparedStatement ps = conn.prepareStatement("delete from product where quantity<2");
			
			
			int x = ps.executeUpdate();
			
			if(x>0)System.out.println(x+" queries are updted");
			else System.out.println("Update failed");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Closing the connection
			try {
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
