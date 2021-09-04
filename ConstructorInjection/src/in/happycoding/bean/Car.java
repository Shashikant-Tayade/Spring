package in.happycoding.bean;

public class Car 
{
	private int id;
	private String company;
	private Engine engine;
	
	
	public Car() {
		super();
	}


	public Car(int id, String company, Engine engine) {
		super();
		this.id = id;
		this.company = company;
		this.engine = engine;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", engine=" + engine + "]";
	}
	
	
	
}
