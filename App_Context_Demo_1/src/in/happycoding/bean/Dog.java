package in.happycoding.bean;

public class Dog 
{
	private String colour;
	private String breed;
	
	public Dog() {
		super();
	}

	public Dog(String colour, String breed) {
		super();
		this.colour = colour;
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [colour=" + colour + ", breed=" + breed + "]";
	}
	
	
}
