package in.happycoding.bean;

public class Laptop 
{
	private String modelNo;
	private String ram;
	private String price;
	
	public Laptop() {
		super();
	}

	public Laptop(String modelNo, String ram, String price) {
		super();
		this.modelNo = modelNo;
		this.ram = ram;
		this.price = price;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [modelNo=" + modelNo + ", ram=" + ram + ", price=" + price + "]";
	}

	


}
