package com.Rajiv.App;

import com.Rajiv.Implement.Services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Services service=new Services();
       service.insertAtBeginning(10);
       service.insertAtBeginning(20);
       service.insertAtBeginning(30);
       service.insertAtBeginning(40);
     service.insertAtBeginning(60);
//       service.insertAtBeginning(80);
//       service.insertAtBeginning(90);
//       service.insertAtBeginning(20);
       
      // service.printAll();
       
       service.insertAtEnd(500);
       
       service.printAll();
       
       System.out.println("Middle element is: "+service.findMiddleElement());
       
       System.out.println("Nth node is"+service.valueAtNthNode(7));
       
       
		
	}

}
