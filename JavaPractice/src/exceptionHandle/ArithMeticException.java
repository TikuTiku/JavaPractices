package exceptionHandle;

public class ArithMeticException {

	public static void main(String[] args) 
	{
		//1.Without Exception Handling
		//int a=50/0;
		//System.out.println(a);
		
		//2.Withxception Handling
		
		try
		{
			int a=50/0;
			
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
		System.out.println("This is exception handling in java java");
		

	}

}
