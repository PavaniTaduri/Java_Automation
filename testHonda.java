package coding;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class testHonda {
	
	public static car honda;
	
     @BeforeClass
      
     public static void doFirst()
     {
    	 honda = new electricCar("Red",100);
   // 	 honda = new car("Red",100);
  //  	 honda.colour = "Red";
  //  	 honda.height = 100;
    	 System.out.println("executing first");
     }
     
     
	@Test
	public void testStart() {
		boolean started = honda.start();
		Assert.assertEquals(true, started);

}
	
	@Test
	
     public void testColourHonda()
     {
		boolean result;
		result=(honda.getColour()=="Red") ? (result = true):(result = false);
		Assert.assertEquals(true, result);
     }
}