package Problems;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Problem4 {

	public static void main(String[] args) {
		///////////////TASK-1//////////////
		LinkedHashSet<Integer> linked=new LinkedHashSet<>();
		
		//add 5,3,7,1,9,2 in LinkedHashSet
	     linked.add(5);
	     linked.add(3);
	     linked.add(7);
	     linked.add(1);
	     linked.add(9);
	     linked.add(2);
	     
	     //print elements
	     System.out.println("Elements in LinkedHashSet are:\n"+linked);
	     
		//remove element 3's
          linked.remove(3);
          
        //updated list displaying
          System.out.println("After removing 3 Elements in LinkedHashSet are:\n"+linked);
 	     
          System.out.println("===========================================================================");
          
          ////////////////TASK-2///////////////
          TreeSet<String> tree=new TreeSet<>();
          
          //Add strings: "apple," "banana," "orange," "grape," "kiwi," "mango."
           tree.add("apple");
           tree.add("banana");
           tree.add("orange");
           tree.add("grape");
           tree.add("kiwi");
           tree.add("mango");
           
           //Display elements in TreeSet
           System.out.println("Elements in TreeSet are:\n"+tree);  
           
           //remove element  with value "orange"
           tree.remove("orange");
           
           //display update TreeSet after removing "orange"
           System.out.println("After removing \"orange\" Elements in TreeSet are:\n"+tree);  
           
	}

}
