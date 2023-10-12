package com.glo.Application;

import java.util.Scanner;

import com.glo.Model.Employee;
import com.glo.Repo.Repository;
import com.glo.Service.Services;

public class Executor {

	public static void main(String[] args) {
	
		
		Services service=new Services();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("=========================================================");
			System.out.println("Enter 1 to add new Employee");
			System.out.println("Enter 2 to delete a specific employee based on Id");
			System.out.println("Enter 3 to update details of a employee based on Id");
			System.out.println("Enter 4 to get details of all the emplloyees");
			System.out.println("Enter 5 to Exit");
			System.out.println("=========================================================");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				service.add();
				break;
			case 2:
				service.delete();
			    break;
			case 3:
				service.update();
				break;
			case 4:
				service.getEmployee();
				break;
			
			case 5:
				System.out.println("Exited!!!!!!!");
				System.exit(0);
				break;
			
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
		

	}

}
