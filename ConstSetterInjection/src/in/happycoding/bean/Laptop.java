package in.happycoding.bean;

public class Laptop 
{
	private String company;
	private int ram;
	private HDD hdd;
	
	public Laptop() {
		super();
	}

	
	public Laptop(String company, int ram, HDD hdd) {
		super();
		this.company = company;
		this.ram = ram;
		this.hdd = hdd;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	
	public HDD getHdd() {
		return hdd;
	}


	public void setHdd(HDD hdd) {
		this.hdd = hdd;
	}


	@Override
	public String toString() {
		return "Laptop [company=" + company + ", ram=" + ram + ", hdd=" + hdd + "]";
	}

	
	
	
	
}
