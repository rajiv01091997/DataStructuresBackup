package com.glo.Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		//creating Stream from list
		Stream<Integer> st=list.stream();
		
		//filter odd number and find their squares and then sum it
         int sum=st.filter(n->n%2!=0).map(n->n*n).reduce(0, (a,b)->(a+b));
         
         System.out.println(sum);
	}

}
