package in.happycoding.bean;

public class TV 
{
	private String name;
	private String function;
	private String price;
	
	public TV() {
		super();
	}

	public TV(String name, String function, String price) {
		super();
		this.name = name;
		this.function = function;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TV [name=" + name + ", function=" + function + ", price=" + price + "]";
	}
	
	   
	
}
