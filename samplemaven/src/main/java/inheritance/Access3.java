package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj = new Access1();
		obj.display1();
		Access3 obj1 = new Access3();
		obj1.display1();
		obj1.display3();

	}

}
