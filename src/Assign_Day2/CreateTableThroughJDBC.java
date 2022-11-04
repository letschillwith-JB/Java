package Assign_Day2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTableThroughJDBC {
	
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver class not found");
		e.printStackTrace();
	}
	
	String url = "jdbc:mysql://localhost:3306/sb101_db";
	
	try (Connection conn = DriverManager.getConnection(url,"root","root")){
		
		Statement st = conn.createStatement();
		
		//insert 5 product in product table using Scanner
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter ProductID of product "+i);
			int pid = sc.nextInt();
			
			System.out.println("Enter Product Name of product "+i);
			String pname = sc.next();
			
			System.out.println("Enter Quantity of product "+i);
			int qty = sc.nextInt();
			
			System.out.println("Enter Price of product "+i);
			int price = sc.nextInt();
			
		int x = st.executeUpdate("insert into product values("+pid+",'"+pname+"',"+qty+","+price+")");
		
		if(x>0) {
			System.out.println(x+" queries updated");
		}
		else System.out.println("Updation failed");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
