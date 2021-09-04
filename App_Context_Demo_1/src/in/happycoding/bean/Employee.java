package in.happycoding.bean;

public class Employee 
{
	private int roll;
	private String firstname;
	private String lastname;
	
	
	
	public Employee() {
		super();
	}



	public Employee(int roll, String firstname, String lastname) {
		super();
		this.roll = roll;
		this.firstname = firstname;
		this.lastname = lastname;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
