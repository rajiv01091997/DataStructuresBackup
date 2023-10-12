package NormalQueue;

public class Implementation {
	
	int ar[]=new int[5];
	int front=0,rear=-1;
	int size=rear+1;
	
	

	public static void main(String[] args) {
		
		Implementation queue=new Implementation();
		queue.insert(3);
		queue.insert(4);
		queue.insert(6);
		queue.insert(7);
		queue.insert(8);
		queue.print();
		System.out.println("Size:"+(queue.rear+1)+" "+queue.rear);
		queue.remove();
		queue.remove();
		queue.print();
		System.out.println("Size:"+(queue.rear+1)+" "+queue.rear);
		queue.peek();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println("Size:"+(queue.rear+1)+" "+queue.rear);
		queue.remove();
		
		
	}
	
	public void insert(int value)
	{
		if(rear+1==ar.length)
		{
			System.out.println("Queue full");
			return;
		}
		rear++;
		ar[rear]=value;
		
	}
	public void remove()
	{
		if(rear+1==0)
		{
			System.out.println("Queue Empty");
			return;
		}
		System.out.println("Deleted value is: "+ar[front]);
		for(int i=front;i<rear;i++)
		{
			ar[i]=ar[i+1];
		}
		rear--;
	
	}
	
	public void peek()
	{
		if(rear+1==0)
		{
			System.out.println("Queue Empty");
			return ;
		}
		System.out.println(ar[front]);
	}
	
	public boolean isEmpty()
	{   
		if(rear+1==0)
		{
			System.out.println("Queue Empty");
			return true;
		}
		return false;
	}
	
	public void print()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}

}
