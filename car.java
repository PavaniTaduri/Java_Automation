package coding;

public class car {
  private String colour;
  private int height;
  
  public car (String c, int h)
  {
	  this.colour = c;
	  this.height = h;
  }
     
	public boolean start() {
	System.out.println("started");
	return true;
	
}
      public boolean stop()
      {
    	System.out.println("stopped");
    	return true;
      }
      
      public String getColour()
      {
    	  return this.colour;
      }
}

