package coding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class splitStringCreate {
	static File myFile;
	static String userdetails[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
		
		File myFile = new File("c://users//assignment.txt");
        System.out.println(myFile.exists());
        Scanner myScanner = new Scanner(myFile);
        while (myScanner.hasNextLine())
        {
       	 String line = myScanner.nextLine();
       	 userdetails = line.split(",");
       	 
       	 for (int i=0; i < userdetails.length ; i++)
       	 {
       		switch(i)
       		{
       		case 0:
       		{
       			System.out.println("Username: "+userdetails[i]);
       			break;
       		}
       		case 1:
       		{
       			System.out.println("Password: "+userdetails[i]);
       			break;
       		}
       	 }
	}
	}
	}
	
	catch(FileNotFoundException f)
	{
		System.out.println("File not found");
	}
}
}
	


