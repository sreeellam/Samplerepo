package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void display()
	{
		System.out.println("to the child class");
		super.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SuperMethodChild obj =  new SuperMethodChild();
		 obj.display();

	}

}
