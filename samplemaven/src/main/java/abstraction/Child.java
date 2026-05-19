package abstraction;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.addition();
		obj.subtraction();

	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		int a =40;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}

}
