package com.globallogic;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.println("Enter the values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int start=0,end=ar.length-1;
		while(start<end)
		{
			if(ar[start]==0)
			{
				start++;
			}
			if(ar[end]==1)
			{
				end--;
			}
			if(ar[start]==1&& ar[end]==0)
			{
				int temp=ar[start];
				ar[start]=ar[end];
				ar[end]=temp;
			}
		}
		
		for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
	}

}
