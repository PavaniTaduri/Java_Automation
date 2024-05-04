package coding;

public class electricCar extends car {

	public electricCar(String c, int h)
	{
		super(c,h);
	}
	public boolean autoSteer()
	{
		return true;
	}
	public boolean start()
	{
		System.out.println("started by pushing a button");
		return true;
	}
}
