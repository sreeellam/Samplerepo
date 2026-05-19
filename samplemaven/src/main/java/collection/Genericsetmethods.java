package collection;

import java.util.HashSet;
import java.util.Set;

public class Genericsetmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> days = new HashSet <String> ();
		//Add Method
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
System.out.println(days);

//addAll - Used to add the elements of one set to another set
Set <String> daysOne = new HashSet <String> ();
daysOne.add("Wednesday");
daysOne.add("Thursday");
daysOne.add("Friday");
daysOne.add("Saturday");

days.addAll(daysOne);
System.out.println(days);
System.out.println(daysOne);

//contains 

System.out.println(days.contains("Friday"));

//conatainsAll - To check whether all the elements of one set is contained in another set

System.out.println(days.containsAll(daysOne));
System.out.println(daysOne.containsAll(days));

//isEmpty

System.out.println(days.isEmpty());

//remove
daysOne.remove("Friday");
System.out.println(daysOne);

//removeAll - To remove all the elemebnts of one set from another set
days.removeAll(daysOne);
System.out.println(days);

//size

System.out.println(days.size());

//clear - To delete all the elements from a set but the object remains.

daysOne.clear();
System.out.println(daysOne);







	}

}
