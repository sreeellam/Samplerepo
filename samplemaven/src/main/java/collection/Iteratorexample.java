package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> days = new HashSet <String> ();
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		days.add("Thurs");
		
		Iterator it = days.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		
		System.out.println(days);

		
	}

}
