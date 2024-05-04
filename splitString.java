package coding;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Taduri,Sravani ";
		String s2= new String("Pavani");
		String[] strArray = s1.split(",");
		for (int i=0; i < strArray.length; i++)
		{
				System.out.println(strArray[i].toUpperCase());
	}

}
}

