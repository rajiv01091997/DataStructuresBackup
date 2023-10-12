package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private int[] marks=new int[5];


	public Student(String name, int age, int[] marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + Arrays.toString(marks) + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int thisAvg=0;
		int average=0;
		for(int j=0;j<5;j++)
		{
			average+=o.getMarks()[j];
		}
		for(int j=0;j<5;j++)
		{
			thisAvg+=this.getMarks()[j];
		}
		
          //descending order
		return (int) (average/5.0-thisAvg/5.0);
	}


}

public class Problem1 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		int k=1;
	while(k==1)
	{
			System.out.println("Enter 1 to Enter the details for student");
			System.out.println("Enter 2 to calculate the average of each student");
			System.out.println("Enter 3 to display details of each student");
			System.out.println("Enter 4 to sort the arraylist based on average");
			System.out.println("Enter 5 to search for a student based on name");
			System.out.println("Enter 6 to update the scores and get new avg of a student based on name");
			System.out.println("Enter 7 to remove a specific student based on name");
	        System.out.println("Enter 8 to exit");
	        int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the Student number 1/2/3 whose details to be entered");
			int ind=sc.nextInt()-1;
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("Enter marks of 5 subjects giving single b/w each marks");
			int arr[]=new int[5];
			for(int i=0;i<5;i++)
			{
				arr[i]=sc.nextInt();
			}
			Student s1=new Student(name, age, arr);
			list.add(ind,s1);
			break;
			
		case 2:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				break;
			}
			for(int i=0;i<list.size();i++)
			{
				int average=0;
				int temp[]=list.get(i).getMarks();
				for(int j=0;j<5;j++)
				{
					average+=temp[j];
				}
				System.out.println(average/5.0);
			}
			break;
		case 3:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				break;
			}
			
			for(int i=0;i<list.size();i++)
			{
				int average=0;
				int temp[]=list.get(i).getMarks();
				for(int j=0;j<5;j++)
				{
					average+=temp[j];
				}
				System.out.println("Name:"+list.get(i).getName()+", Age:"+list.get(i).getAge()+", Average:"+ (average/5.0));
			}
			break;
		case 4:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				break;
			}
			Collections.sort(list);
			System.out.println("Sorted list in descending order:");
			System.out.println(list);
			break;
			
		case 5:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				break;
			}
			System.out.println("Enter the name to be searched in the ArrayList");
			String keyName=sc.next();
			int count=0;
			for(Student s:list)
			{
			if(s.getName().equals(keyName))
			   {
				System.out.println(s);
				count++;
			   }
			}
			if(count==0)
			System.out.println("Not found");
			break;
			
		case 6:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				return;
			}
			System.out.println("Enter the name of the student whose scores is to be changed");
			String Name=sc.next();
			int avg=0;
			int flag=0;
			for(Student s:list)
			{
			if(s.getName().equals(Name))
			   {   flag++;
					System.out.println("Enter the 5 scores");
					int brr[]=new int[5];
					for(int i=0;i<5;i++)
					{
						brr[i]=sc.nextInt();
						avg=avg+brr[i];
					}
					s.setMarks(brr);
					System.out.println("New Average:"+avg/5.0);
					break;
			   }
			}
			 if(flag==0)
	            {
	            	System.out.println("No student found with such name");
	            }
			break;
		
		case 7:
			if(list.size()==0)
			{
				System.out.println("No student present first add 3 students");
				return;
			}
			System.out.println("Enter the name of the student which is to be removed from list");
			String n=sc.next();
			int counter=0;
			for(Student s:list)
			{
			if(s.getName().equals(n))
			   {
				list.remove(s);
				counter++;
				break;
				
			   }
			}
            if(counter==0)
            {
            	System.out.println("No student found with such name");
            }
			break;
			
		case 8:
			k=0;
			break;
			
		default:
			System.out.println("wrong choice");
			
			
		}
		
		
	}

  }
}
