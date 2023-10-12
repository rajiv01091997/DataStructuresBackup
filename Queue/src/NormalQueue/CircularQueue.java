package NormalQueue;

public class CircularQueue {
	int ar[]=new int[5];
	int length=ar.length;
	int front=-1,rear=-1;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CircularQueue cq=new CircularQueue();
cq.add(5);
cq.add(10);
cq.add(16);
cq.add(16);
cq.add(16);

cq.print();
System.out.println(cq.front+" "+cq.rear);
cq.remove();
cq.print();
System.out.println(cq.front+" "+cq.rear);
cq.add(24);
cq.print();
System.out.println(cq.front+" "+cq.rear);
cq.remove();
cq.add(3);
System.out.println(cq.front+" "+cq.rear);
cq.print();
cq.remove();cq.remove();cq.remove();cq.remove();
cq.print();
cq.remove();


	}
	
	public void add(int value)
	{
		if((rear+1)%length==front)
		{
			System.out.println("Circular Queue full");
			return;
		}
		//front will be increment only once when first element is inserted
		if(front==-1)
		{
			front++;
		}
		rear=(rear+1)%length;
		ar[rear]=value;
	}

	public void remove()
	{
		if(front==rear && front==-1)
		{
			System.out.println("Circular queue Empty");
			return;
		}
		
	    System.out.println("Deleted element is:"+ ar[front]);
	    //if there is only one element then make front and rear to -1
	    if(front==rear && front!=-1)
	    {
	    	front=-1;
	    	rear=-1;
	    }
	    else
	    front=(front+1)%length;
	}
	
	
	public void print()
	{
		
		//if empty
		if(front==rear  && front==-1)
		{
			System.out.println("Empty");
		    return;
		}
		//if one element only
		else if(front==rear  && front!=-1)
		{
			System.out.println(ar[front]);
		    return;
		}
		
		
		//for more than one element
		
		if(front<rear)
		{
		for(int i=front;i<=rear;i++ )
			System.out.print(ar[i]+" ");
		System.out.println();
		
		}
		else
		{
			for(int i=0;i<=rear;i++)
			{
				System.out.print(ar[i]+" ");
			}
			for(int i=front;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
			
			System.out.println();
		}
	}

}

	

