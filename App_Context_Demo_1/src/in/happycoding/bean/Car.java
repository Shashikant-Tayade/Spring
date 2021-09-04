package in.happycoding.bean;

public class Car 
{
	private int num_of_wheels;
	private String colour;
	
	
	public Car() {
		super();
	}


	public Car(int num_of_wheels, String colour) {
		super();
		this.num_of_wheels = num_of_wheels;
		this.colour = colour;
	}


	public int getNum_of_wheels() {
		return num_of_wheels;
	}


	public void setNum_of_wheels(int num_of_wheels) {
		this.num_of_wheels = num_of_wheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Car [num_of_wheels=" + num_of_wheels + ", colour=" + colour + "]";
	}
	
	
	
	
}
