package Basic1;



public class AddFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddProgram a = new AddProgram();
		int actualresults = a.add(10,20);
		int expectedresults = 30;
		System.out.println(actualresults);
		
		if (actualresults == expectedresults)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
