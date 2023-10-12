package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	ArrayList<Integer> arr=new ArrayList<>();
	int top=-1;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 Problem2 stack=new Problem2();
		while(true)
		{
			System.out.println("Enter 1 to push element into stack");
			System.out.println("Enter 2 to pop from stack");
			System.out.println("Enter 3 to check if stack is empty");
			System.out.println("Enter 4 to display content of stack");
			System.out.println("Enter 5 to exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the element to be pushed");
				int value=sc.nextInt();
				stack.push(value);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				if(stack.size()==0)
				{
					System.out.println("Yes,Empty");
				}
				else
					System.out.println("No");
				break;
			case 4:
				stack.print();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
				
		}
		 
     
	}
	
	public void push(int value)
	{
		if(size()==10)
		{
			System.out.println("Stack full,couldn't push");
			return;
		}
		top++;
		arr.add(value);
		System.out.println("Pushed into Stack");
	}
	public void pop()
	{
		if(size()==0)
		{
			System.out.println("Nothing to delete");
			return;
		}
		System.out.println("Deleted value: "+arr.get(top));
		top--;
	}
	public void peek()
	{

		if(size()==0)
		{
			System.out.println("Empty stack,no element to peek");
			return;
		}
		System.out.println(arr.get(top));
	}
	
	public void print()
	{
		if(size()==0)
		{
			System.out.println("Empty stack,nothing to print");
			return;
		}
		
		System.out.println("Elements in Stack are:");
		for(int i=0;i<=top;i++)
		{
			
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	
	
	public int size()
	{
		return top+1;
	}
	


}
