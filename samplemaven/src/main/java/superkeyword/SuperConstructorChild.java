package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super(2,5);
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
		

	}

}
