package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	String color = "green";
	
	public void print()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();

	}

}
