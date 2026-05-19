package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		int age = 9;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new AgeException("Age below 18");
		}


	}

}
