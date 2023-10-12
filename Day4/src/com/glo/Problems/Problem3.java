package com.glo.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem3 {

	public static void main(String[] args) {
		
         List<String> list=Arrays.asList("Rajiv","Aman","Gaurav","Shekhar","Harshal","Aron");
		
		//stream making
		Stream<String> st=list.stream();
		
		//count Strings that does not starts with "A"
		long count=st.filter(a->!a.startsWith("A")).count();
		
		System.out.println(count);
		

	}

}
