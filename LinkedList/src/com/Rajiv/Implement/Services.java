package com.Rajiv.Implement;

import com.Rajiv.Model.Node;

public class Services {
	public Node head=null;

	public void insertAtBeginning(int value)
	{
		Node node=new Node(value,null);
		if(head==null)
			head=node;
		else
		{
			node.setNext(head);
			head=node;
		}
	}
	
	public void insertAtEnd(int value)
	{
		Node node=new Node(value,null);
		if(head==null)
			head=node;
		else
		{
			Node temp=head;
			while(temp.getNext()!=null)
			{
				
				temp=temp.getNext();
			}
			temp.setNext(node);
			
		}
	}
	
	public int findMiddleElement()
	{
		Node slow=head,fast=head;
		if(head==null)
		{
			System.out.println("Nothing to print for middle");
			return 0;
		}
		while(fast.getNext()!=null && fast.getNext().getNext()!=null)
		{
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		
			return slow.getValue();
	
		
		
		
	
	}
	
	public int valueAtNthNode(int n)
	{
		Node temp=head;
		if(temp==null)
		{
			System.out.println("empty linked list");
			return -1;
		}
		int count=0;
		while(temp!=null)
		{  
			
			count++;
			if(count==n)
			{
				return temp.getValue();
				
			}
			temp=temp.getNext();
		}
		
		
		
		return -1;
	}
	 
	
	
	public void printAll()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.getValue());
			temp=temp.getNext();
		}
		
	}
	
}
