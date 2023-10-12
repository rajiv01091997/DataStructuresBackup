package com.glo.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.*;
import java.util.random.*;

class Employee
{
	private int id;
	private String name;
	private double salary;
	private String address;
	
	
	
	public Employee() {
		super();
		
	}



	public Employee(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}


public class Problem9 {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Rajiv", 60000, "Kolkata"));
		list.add(new Employee(1, "Aman", 50000, "Ranchi"));
		list.add(new Employee(1, "Ketan", 550000, "Delhi"));
		list.add(new Employee(1, "Balram", 80000, "Mumbai"));
		list.add(new Employee(1, "Ravi", 45000, "Ranchi"));
		list.add(new Employee(1, "Dhoni", 66000, "Ranchi"));
		list.add(new Employee(1, "Jasprit", 35000, "Mumbai"));
		list.add(new Employee(1, "Yuvi", 85000, "Punjab"));
		list.add(new Employee(1, "Bhuvi", 100000, "Delhi"));
		
		//1.Filtering employee based on a specific address
		Predicate<Employee> AreaFilter=e->e.getAddress().equalsIgnoreCase("ranchi");
		List<Employee> empList=new ArrayList<>();
		for(Employee emp:list)
		{
			if(AreaFilter.test(emp))
			{
				empList.add(emp);
			}
		}
		empList.forEach(System.out::println);
		                           
		System.out.println("=========================================================================");
		
		//2.Generating 30 random number between 50 and 60 using Supplier
		Supplier<List<Integer>> RandomNumberGenerator=()->{
			List<Integer> list1=new ArrayList<>();
			Random ran=new Random();//making object of Random class present in util package
			for(int i=0;i<30;i++)
			{
				int num=ran.nextInt(500,600 );
				list1.add(num);
			}
			return list1;
		                                   };
		
		 System.out.println("Random number between 500 and 600 are:\n"+RandomNumberGenerator.get());
		 
		 System.out.println("=========================================================================");
	
	
	     //3.Calculating Annual salary of employees given their monthly salary
	
	      Function<Employee,Double> AnnualSalaryCalculator=e->e.getSalary()*12;
	      
	      List<Double> annualSalaryList=new ArrayList<>();
	      for(Employee emp:list)
	      {
	    	  annualSalaryList.add(AnnualSalaryCalculator.apply(emp));
	      }
	      System.out.println("List of Employees Annual salary is:\n"+annualSalaryList);
	      
	      System.out.println("=========================================================================");
	      
	      
	      //4.Print details of all the Employee
	      Consumer<Employee> EmployeeDetailPrinter=e->System.out.println(e);
	      System.out.println("Details of all the Employees are:");
	      for(Employee emp:list)
	      {
	    	  EmployeeDetailPrinter.accept(emp);
	      }
	      
	      System.out.println("=========================================================================");
	      
	      
	}

}
	
