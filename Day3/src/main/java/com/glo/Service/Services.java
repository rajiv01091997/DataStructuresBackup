package com.glo.Service;

import java.util.Scanner;

import com.glo.Model.Employee;
import com.glo.Repo.Repository;

public class Services {
	Scanner sc=new Scanner(System.in);
	Repository repo=new Repository();
	
	public void add()
	{
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		sc.nextLine();//killing extra line
		System.out.println("Enter name of the Employee");
		String name=sc.nextLine();
		System.out.println("Enter designation of the Employee");
		String designation=sc.nextLine();
		System.out.println("Enter Salary of the Employee");
		double salary=sc.nextDouble();
		Employee emp=new Employee(id,name,designation,salary);
		repo.AddEmployee(emp);
	}
	public void getEmployee()
	{
		repo.getEmployees();
	}
    public void update()
    {System.out.println("Enter Employee Id whose records needs to be modified");
	int id=sc.nextInt();
	sc.nextLine();//killing extra line
	System.out.println("Enter new name of the Employee");
	String name=sc.nextLine();
	System.out.println("Enter new designation of the Employee");
	String designation=sc.nextLine();
	System.out.println("Enter new salary of the Employee");
	double salary=sc.nextDouble();
	Employee emp=new Employee(id,name,designation,salary);
    	
    	repo.updateEmployee(emp);
    }
    public void delete()
    {
    	System.out.println("Enter the Id of employee whose record is to be deleted");
    	int id=sc.nextInt();
    	repo.deleteEmployee(id);
    }
}
