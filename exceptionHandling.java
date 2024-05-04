package coding;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=0;
		
		try
		{
		int result = i/j;
		System.out.println("result is:" +result);

	}
       
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally executing");
		}
}

	
		
	}