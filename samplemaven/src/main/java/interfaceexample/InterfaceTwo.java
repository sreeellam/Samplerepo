package interfaceexample;

public class InterfaceTwo implements InterfaceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTwo obj = new InterfaceTwo();
		obj.add();
		obj.display();
		obj.print();
		
		//reference creation
		InterfaceOne obj1 = new InterfaceTwo();
		obj1.add();
		obj1.display();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
	}
	public void print()
	{
		System.out.println("child class");
	}

}
