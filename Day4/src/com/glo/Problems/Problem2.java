package com.glo.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2 {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Rajiv","Aman","Gaurav","Shekhar","Harshal");
		
		//stream making
		Stream<String> st=list.stream();
		
		//Comparator object for sorting in alphabetic order
		Comparator<String> comp=(a,b)->
		{
			return a.compareTo(b);
		};
		//sort based on alphabets and return list
		List<String> newList=st.sorted(comp).collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
