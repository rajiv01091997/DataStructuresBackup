package com.glo.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record  Persons(String name, int age)
{
	
}



public class Problem7 {

	public static void main(String[] args) {
		 
		ArrayList<Persons> list=new ArrayList<>();
		list.add(new Persons("Jai", 18));
		list.add(new Persons("Raghu", 26));
		list.add(new Persons("Rajiv", 25));
		list.add(new Persons("Niraj", 23));
		list.add(new Persons("Aman", 19));
		
		
		
		//sort list of person based on age
		List<Persons> list2=list.stream().sorted((a,b)->
		{
			if(a.age()>b.age())
				return 1;
			else if(b.age()>a.age())
				return -1;
			else return 0;
		}).collect(Collectors.toList());
		
		System.out.println("Sorted list based on age:\n"+list2);
		
		
		
		//finding average of person's age having age greater than 20
		double average=list.stream().filter(a->a.age()>20).map(n->n.age()).mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average of Employee having age greater than 20 is:"+average);
         
	}

}
