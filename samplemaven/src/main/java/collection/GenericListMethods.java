package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List <String> fruits = new ArrayList <String> ();
		
		//Method add() To add elements into the list
		
		fruits.add("apple");
		
		fruits.add("banana");fruits.add("kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		
		//get Method - Used to get an element at the specified index
		System.out.println(fruits.get(0));
		
		//set Method - Used to set a new value by replacing the existing
		
         fruits.set(2, "orange");
         System.out.println(fruits);
         
         //indexOf Method - To find the first occurrence of an element
         
         System.out.println(fruits.indexOf("banana"));
         
         //lastIndexOf Method - To find the last occurrence of an element
         
         System.out.println(fruits.lastIndexOf("banana"));
         
         //remove Method - To remove an element
         
         fruits.remove("orange");
         System.out.println(fruits);
         
         fruits.remove(1);
         System.out.println(fruits);
         
         //contains Method - To check whether a given element is present or not in the list
         
         System.out.println(fruits.contains("apple"));
         System.out.println(fruits.contains("kiwi"));
         
         //isEmpty Method - To check whether the given list is empty or not
         
        System.out.println(fruits.isEmpty());
        
        //size Method - Used to find the number of elements in the list
        
        System.out.println(fruits.size());
         
	}

}
