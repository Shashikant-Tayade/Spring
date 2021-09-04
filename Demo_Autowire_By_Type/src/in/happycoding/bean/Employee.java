package in.happycoding.bean;

public class Employee {

	private int id;
	private String name;
	
	private Date joiningDate;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, Date joiningDate, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joiningDate=" + joiningDate + ", address=" + address + "]";
	}
	
	
	
	
}
