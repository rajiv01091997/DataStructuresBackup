package Problem1;
import java.util.*;
public class StudentManagementSystem {

	public static void main(String[] args) {
		Student ar[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		int k=1;
		while(k==1)
		{
			System.out.println("Enter 1 to Enter the details for student");
			System.out.println("Enter 2 to calculate the average of each student");
			System.out.println("Enter 3 to display details of each student");
			System.out.println("Enter 4 to exit");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Student number whose details to be entered");
				int ind=sc.nextInt()-1;
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter age");
				int age=sc.nextInt();
				System.out.println("Enter marks of 5 subjects");
				int arr[]=new int[5];
				for(int i=0;i<5;i++)
				{
					arr[i]=sc.nextInt();
				}
				Student s1=new Student(name, age, arr);
				ar[ind]=s1;
				break;
				
			case 2:
				
				for(int i=0;i<3;i++)
				{
					int average=0;
					int temp[]=ar[i].getMarks();
					for(int j=0;j<5;j++)
					{
						average+=temp[j];
					}
					System.out.println(average/5.0);
				}
				break;
			case 3:
				for(int i=0;i<3;i++)
				{
					int average=0;
					int temp[]=ar[i].getMarks();
					for(int j=0;j<5;j++)
					{
						average+=temp[j];
					}
					System.out.println("Name: "+ar[i].getName()+" Age: "+ar[i].getAge()+" Average: "+ (average/5.0));
				}
				break;
				
				
			case 4:
				k=0;
				break;
				
			default:
				System.out.println("wrong choice");
				
				
			}
		}
		

	}

}
