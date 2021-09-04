package in.happycoding.bean;

public class Car 
{
	private String company;
	private Engine engine;
	
	
	public Car() 
	{
		super();
	}


	public Car(String company, Engine engine) 
	{
		super();
		this.company = company;
		this.engine = engine;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}


	public void run()
	{
		if(this.engine == null)
		{
			System.out.println("Engine not found...\nUnable to Start the  car...");
		}
		else
		{
			System.out.println("Running...");
		}
	}
	
	
	@Override
	public String toString() 
	{
		return "Car [company=" + company + ", engine=" + engine + "]";
	}
	
	
	
	
	
}
