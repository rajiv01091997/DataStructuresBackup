package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem5 {

	public static void main(String[] args) {
		HashMap<String,Integer> employeeSalaries=new HashMap<>();
		 employeeSalaries.put("ashok", 5000);
		 employeeSalaries.put("vikram", 80000);
		 employeeSalaries.put("deepak", 65000);
		 employeeSalaries.put("brijesh", 15000);
		 employeeSalaries.put("aman", 9000);
		 
		 
		 Problem5 pb=new Problem5();
		 System.out.println("===============================================================");
		 //content of map
		 pb.display(employeeSalaries);
		 System.out.println("===============================================================");
		 //total salary print
         System.out.println("Total salary Expenditure:"+pb.totalSalary(employeeSalaries));
         System.out.println("===============================================================");
         //print employee details with highest salary
         pb.EmployeeWithHighestSalary(employeeSalaries);
         System.out.println("===============================================================");
         //update salary of a employee by some percentage based on his name
         pb.SalaryIncrementUpdation(employeeSalaries, "vikram", 10);
	}

	public void display(Map<String, Integer> map)
	{
		Set<String> set=map.keySet();
		for(String key:set)
		{
			System.out.println("Employee:"+key+", Salary:"+map.get(key));
		}
	}
	
	public int totalSalary(Map<String, Integer> map)
	{
		Set<String> set=map.keySet();
		int total=0;
		for(String key:set)
		{
			total+=map.get(key);
		}
		return total;
	}
	public void EmployeeWithHighestSalary(Map<String, Integer> map)
	{
		Set<String> set=map.keySet();
		int highest=Integer.MIN_VALUE;
		String name="";
		for(String key:set)
		{name="";
			if(map.get(key)>highest)
			{
				name=key;
				highest=map.get(key);
				break;
			}
		}
		System.out.println("Detail of Employee with Highest salary is:\n"+"Employee:"+name+", Salary:"+highest);
		
	}
	public void SalaryIncrementUpdation(Map<String, Integer> map,String name,int percent)
	{
		Set<String> set=map.keySet();
		
		for(String key:set)
		{
			if(key==name)
			{
				map.put(key, map.get(key)+(percent*map.get(key)/100));
				break;
			}
		}
		display(map);
	}
}
