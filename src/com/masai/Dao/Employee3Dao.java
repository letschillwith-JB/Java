package com.masai.Dao;

import java.util.ArrayList;

public interface Employee3Dao {
	
	public String insertEmployee3Details(int eid, String name, String address, int salary);
	
	public ArrayList getAllEmployee3Details();
	
	public int getSalary(int eid);
	
	public String giveBonusToEmployees(int bonus);
}
