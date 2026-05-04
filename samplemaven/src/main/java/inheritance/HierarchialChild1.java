package inheritance;

public class HierarchialChild1 extends HierarchialParent 
{
	public void display1()
	{
	System.out.println("This is the child1 class");
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HierarchialChild1 obj = new HierarchialChild1();
		obj.display1();
		obj.display();

	}

}
