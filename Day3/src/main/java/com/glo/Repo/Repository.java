package com.glo.Repo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.glo.Connection.DBconnection;
import com.glo.Model.Employee;

public class Repository {

	public void AddEmployee(Employee emp) 
	{
		try
		{
		Connection con=DBconnection.connect();
	    PreparedStatement ps=con.prepareStatement("insert into HiltonHotel values(?,?,?,?)");
		ps.setInt(1, emp.getEmpId());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getDesignation());
		ps.setDouble(4, emp.getSalary());
		
		boolean val=ps.execute();
		if(val==false)
			System.out.println("Employee inserted with id:"+ emp.getEmpId());
		else
			System.out.println("can't insert!!!!!!!!!!!");
		
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateEmployee(Employee emp)
	{
		try {
		Connection con=DBconnection.connect();
		PreparedStatement ps=con.prepareStatement("update HiltonHotel set name=?,designation=?,salary=? where empId=?");
		ps.setString(1, emp.getName());
		ps.setString(2, emp.getDesignation());
		ps.setDouble(3, emp.getSalary());
		ps.setInt(4, emp.getEmpId());
		ps.executeUpdate();
		System.out.println("Updated Successfully");
		ps.close();
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getEmployees()
	{
		try {
		Connection con=DBconnection.connect();
		Statement st=con.createStatement();
		//ResultSet rs= st.executeQuery("select * from HiltonHotel");
		
		
		
		CallableStatement callableStatement=(CallableStatement) con.prepareCall("call selectAll()");
		ResultSet rs=callableStatement.executeQuery();
		
		
		
		
		System.out.println("EMPId"+"\t"+"NAME"+"\t"+"DESIG."+"\t"+"SALARY");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
		}
		
		    }
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void deleteEmployee(int id)
	{
		try {
			Connection con=DBconnection.connect();
			CallableStatement callableStatement=(CallableStatement) con.prepareCall("{call deleteById(?)}");
			callableStatement.setInt(1, id);
			callableStatement.executeUpdate();
			System.out.println("Deleted with id= "+id);
		    }
			
			catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	
}
