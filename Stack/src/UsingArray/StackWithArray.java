package UsingArray;

public class StackWithArray {
	
	int arr[]=new int[5];
	int capacity=arr.length;
	int top=-1;

	public static void main(String[] args) {
		
      StackWithArray stack=new StackWithArray();
      stack.push(5);
      stack.push(7);
      stack.push(7);
      stack.push(0);
      stack.push(9);
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.push(95);
      stack.push(9);
      stack.push(24);
      stack.peek();
      
      
     // stack.push(24);
      stack.print();
      System.out.println(stack.size());
	}
	
	public void push(int value)
	{
		if(size()==capacity)
		{
			System.out.println("Stack full,couldn't push");
			return;
		}
		top++;
		arr[top]=value;
	}
	public void pop()
	{
		if(size()==0)
		{
			System.out.println("Nothing to delete");
			return;
		}
		System.out.println("Deleted value: "+arr[top]);
		top--;
	}
	public void peek()
	{

		if(size()==0)
		{
			System.out.println("Empty stack,no element to peek");
			return;
		}
		System.out.println(arr[top]);
	}
	
	public void print()
	{
		if(size()==0)
		{
			System.out.println("Empty stack,nothing to print");
			return;
		}
		
		for(int i=0;i<=top;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public int size()
	{
		return top+1;
	}
	

}
