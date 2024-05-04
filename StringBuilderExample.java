package coding;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("PAVANI TADURI");
		System.out.println(str);
		str.append(" GOOD GIRL");
		System.out.println(str);
		str.delete(2, 5);
		System.out.println(str);
		str.insert(2, "BLACK");
		System.out.println(str);
		str.replace(3,5,"UST");
		System.out.println(str);
		System.out.println(str.substring(0,3));
		System.out.println(str.reverse());
     
	}

}
