package collection;

import java.util.ArrayList;
import java.util.List;

public class nonGenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List  L = new ArrayList();
		
		//Method add() To add elements into the list
		
		L.add("apple");
		
		L.add("A");
		L.add(123);
		L.add(0.55f);
		System.out.println(L);
		
		
		//get Method - Used to get an element at the specified index
		System.out.println(L.get(0));
		
		//set Method - Used to set a new value by replacing the existing
		
         L.set(2, "orange");
         System.out.println(L);
         
         //indexOf Method - To find the first occurrence of an element
         
         System.out.println(L.indexOf("banana"));
         
         //lastIndexOf Method - To find the last occurrence of an element
         
         System.out.println(L.lastIndexOf(0.55f));
         
         //remove Method - To remove an element
         
         L.remove("orange");
         System.out.println(L);
         
         L.remove(1);
         System.out.println(L);
         
         //contains Method - To check whether a given element is present or not in the list
         
         System.out.println(L.contains("apple"));
         System.out.println(L.contains("kiwi"));
         
         //isEmpty Method - To check whether the given list is empty or not
         
        System.out.println(L.isEmpty());
        
        //size Method - Used to find the number of elements in the list
        
        System.out.println(L.size());
         

	}

}
