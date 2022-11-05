package com.masai.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;

import com.masai.JdbcConnector.JdbcConnection;

public class Employee3DaoImpl implements Employee3Dao{

	@Override
	public String insertEmployee3Details(int eid, String name, String address, int salary) {
		
		String message = "Updation Failed";
		
		//getting Connection from JdbcConnection Class
		Connection conn = JdbcConnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into Employee3 values(?,?,?,?)");
			
			ps.setInt(1,eid);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, salary);
			
			int x = ps.executeUpdate();
			message = x+" queries updated...";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
		}  

		return message;
	}

	@Override
	public ArrayList getAllEmployee3Details() {
		ArrayList<String> l1 = new ArrayList<>();
		
		Connection conn = JdbcConnection.getConnection(); 
		try {
			PreparedStatement ps = conn.prepareStatement("select*from employee3");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			
			l1.add("EmployeeID: "+rs.getInt("eid")+", Name: "+rs.getString("name")+", Address: "+rs.getString("address")+", Salary: "+ rs.getInt("salary")+"");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return (ArrayList) l1;
	}

	@Override
	public int getSalary(int eid) {
		int salary=-1;
		Connection conn = JdbcConnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("Select salary from Employee3 where eid=?");
			
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				salary = rs.getInt("salary");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salary;
	}

	@Override
	public String giveBonusToEmployees(int bonus) {
		String message = "Bonus not added";
		
		Connection conn = JdbcConnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("update Employee3 set salary = salary+?");
			
			ps.setInt(1, bonus);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Bonus added to "+x+" Employees";
			
			message = bonus+" as bonus added sucessfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message;
	}
}
