package in.happycoding.ben;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component (value = "student")  // here value is for id

@Scope (value = "prototype")


public class Student 
{
	private int rollno;
	private String firstName;
	private String lastName;
	
	public Student() {
		super();
	}

	public Student(int rollno, String firstName, String lastName) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
