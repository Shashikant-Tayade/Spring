package in.happycoding.bean;

public class Engine 
{

	private String make;

	public Engine() 
	{
		super();
	}

	public Engine(String make) 
	{
		super();
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) 
	{
		this.make = make;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + "]";
	}	
	
	
}
