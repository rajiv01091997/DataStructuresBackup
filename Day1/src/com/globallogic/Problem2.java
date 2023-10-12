package com.globallogic;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.next();
	ArrayList<String> list=new ArrayList<>();
	
	for(int i=0;i<str.length();i++)
	{
		for(int j=i;j<str.length();j++)
		{ String temp="";
			for(int k=i;k<=j;k++)
			{
				temp=temp+str.charAt(k);
			}
			list.add(temp);
		}
	}

	System.out.println(list);
	
	
	int count=0;
	
	for(String s:list)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
				{
				break;
				}
			else if(!map.containsKey(s.charAt(i)) && i==s.length()-1)
			{
				count++;
				break;
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
	}
	System.out.println(count);
	}

}
