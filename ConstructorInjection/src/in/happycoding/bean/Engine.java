package in.happycoding.bean;


public class Engine 
{
	private int id;
	private String make;
	
	public Engine() {
		super();
	}

	public Engine(int id, String make) {
		super();
		this.id = id;
		this.make = make;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", make=" + make + "]";
	}
	
	
	
}

