package Assign_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.PreparedQuery;

public class InsertIntoTableThroughJDBC {
	
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
			
			PreparedStatement ps = conn.prepareStatement("insert into product(pid,pname) values(?,?)");
			
			System.out.println("Enter productID");
			int pid = sc.nextInt();
			
			System.out.println("Enter productName");
			String pname = sc.next();
			
			ps.setInt(1, pid);
			ps.setString(2, pname);
			
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
