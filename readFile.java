package coding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try
		{

         File myFile = new File("c://users//ust1.txt");
         System.out.println(myFile.exists());
         Scanner myScanner = new Scanner(myFile);
         while (myScanner.hasNextLine())
         {
        	 String line = myScanner.nextLine();
        	 System.out.println(line);
         }
		}
		catch(FileNotFoundException f)
		{
			System.out.println("File not found");
		}
	}

}
