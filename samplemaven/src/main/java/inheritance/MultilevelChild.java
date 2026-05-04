package inheritance;

public class MultilevelChild extends MultilevelParent{
	
	public void print()
	{
		System.out.println("This is the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultilevelChild obj = new MultilevelChild();
obj.print();
obj.display();
obj.display1();
	}


}
