package com.glo;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[]= {6,1,7,9,0,2,5,4,3};
		
		QuickSort qs=new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		for(int a:arr)
		System.out.print(a+" ");
		
		
		

	}
	
	
	public void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int partition=partitioning(arr,low,high);
			quickSort(arr,low,partition-1);
			quickSort(arr,partition+1,high);
		}
	}

	public int partitioning(int arr[],int low,int high)
	{   
		int i=low,j=high;
		while(i<=j)
		{
			while(arr[low]<=arr[i] && i<=high)
			{
				i++;
			}
			while(arr[low]>=arr[j] && j>=low)
			{
				j--;
			}
			if(i<j)
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	
	
}





