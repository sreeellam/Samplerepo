package collection;

import java.util.ArrayList;
import java.util.List;

public class Foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		for(int b: a )
		{
			System.out.println(b);
		}

		List <String> colors = new ArrayList <String> ();
		colors.add("Red");
		colors.add("Green");
		colors.add("White");
		for(String S: colors)
		{
			System.out.println(S);
		}
		
		List  colorsOne = new ArrayList ();
		colorsOne.add("Red");
		colorsOne.add(1);
		colorsOne.add('A');
		
		for(Object s: colorsOne)
		{
			System.out.println(s);
		}
	}

}
