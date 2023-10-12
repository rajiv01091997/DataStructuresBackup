package com.glo.Problems;

//by default all the attributes are final
//there are no setter methods in record  bcoz its  not allowed to modify the final members.
//it provides constructor,getter method,toString method,hashcode and equals method implicitly
//you can do some check if needed in the construcor by defining constructor otherwise if no check needed then not required to define
//can declare static method inside record
record  Person(String name, int age)
{
	
}

public class Problem6 {

	public static void main(String[] args) {
		
     Person person1=new Person("Rajiv",23);
     Person person2=new Person("Vishal",22);
     
     System.out.println(person1);//toString is already overridden by record
     System.out.println(person2);
     
     //we can simply call name of the function which is actually getter method
     System.out.println(person1.name());

	}

}
