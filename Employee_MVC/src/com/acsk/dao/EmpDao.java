package com.acsk.dao;

import java.sql.*;

import com.acsk.model.Employee;
import com.acsk.util.DbConnection;

public class EmpDao {
	
	public Connection connection = null;
	public EmpDao() {
		// TODO Auto-generated constructor stub
		connection = DbConnection.getConnection();
	}
	
	public void getAllEmp()
	{
		
	}
	
	public void addEmp(Employee emp)
	{	
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement("INSERT INTO db_acs (emp_name, sal, designation) VALUES (?,?,?)");
			
			ps.setString(1, emp.getEname());
			ps.setInt(2, emp.getSalary());
			ps.setString(3, emp.getDesig());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				//connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void getEmp(String id){
		
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement("Select * from db_acs where id = ?");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
}
