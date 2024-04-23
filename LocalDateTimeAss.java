package coding;

import java.time.LocalTime;

public class LocalDateTimeAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int curtime = 16;
     String greet;
     if(curtime < 12)
     {
    	 greet = "Good morning";
    	 
     }
     else if(curtime >= 12 && curtime <16)
     {
    	 greet = "Good afternoon";
    	 
     }
     else if (curtime >= 16 && curtime <=19)
     {
    	 greet = "Good evening";
    	
     }
     else
     {
    	 greet = "Good night";
    	 
     }
     
	System.out.println(LocalTime.now().getHour() +greet);
	System.out.println("Excepting" + greet + "in the happening");
	}
}

