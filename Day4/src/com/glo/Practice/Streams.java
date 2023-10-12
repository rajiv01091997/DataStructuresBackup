package com.glo.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          List<String> list= new ArrayList<>();
//          list.add("Rajiv");
//          list.add("Angad");
//          list.add("Shami");
//          list.add("Ajinkya");
//          list.add("Aman");
//          
//         List<String>l1= list.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
//          
//          System.out.println(l1);
		
		String tx="""
				Hello
				Hi
				This is
				Rajiv
				""";
		System.out.println(tx);
          
	}

}
