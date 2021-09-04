package in.happycoding.bean;

public class Bike 
{
	private String company;
	private String power;
	private String price;
	
	public Bike() {
		super();
	}

	public Bike(String company, String power, String price) {
		super();
		this.company = company;
		this.power = power;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [company=" + company + ", power=" + power + ", price=" + price + "]";
	}
	
	
	
}
