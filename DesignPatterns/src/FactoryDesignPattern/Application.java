package FactoryDesignPattern;

interface Employee
{
	public int getSalary();
}

class AndroidDeveloper implements Employee
{
int sal;


	public AndroidDeveloper(int sal) {
	super();
	this.sal = sal;
}


	@Override
	public int getSalary() {
		System.out.println("Getting Android Developer Salary");
		return 50000;
	}
	
}


class WebDeveloper implements Employee
{
	private int sal;


	public WebDeveloper(int sal) {
	super();
	this.sal = sal;
}


	@Override
	public int getSalary() {
		System.out.println("Getting WebDeveloper Salary");
		return sal;
	}
	
}

class EmployeeFactory
{
	
	public static Employee getEmployee(String empType)
	{
		if(empType.trim().equalsIgnoreCase("Android developer"))
			return new AndroidDeveloper(50000);
		else if(empType.trim().equalsIgnoreCase("Web developer"))
			return new WebDeveloper(70000);
		else 
			return null;
	}
}

public class Application {

	public static void main(String[] args) {
		
		Employee emp1=EmployeeFactory.getEmployee("android developer");
		Employee emp2=EmployeeFactory.getEmployee("Web developer");
		
		System.out.println(emp1.getSalary());
		System.out.println(emp2.getSalary());
		
	}

}
