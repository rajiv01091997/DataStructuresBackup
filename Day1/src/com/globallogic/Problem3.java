package com.globallogic;
import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams");
			return;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int val1=0,val2=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
			val1=val1+s1.charAt(i);
			}
			if(Character.isAlphabetic(s2.charAt(i)))
			{
			val2=val2+s2.charAt(i);
			}
		}
		if(val1==val2)
		System.out.println("Anagrams");
		else
		System.out.println("Not anagrams");
	}

}
