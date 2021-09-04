package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Employee;
import in.happycoding.bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee theEmployee = context.getBean("employee", Employee.class);
		theEmployee.setId(1011);
		theEmployee.getAddress().setCity("pune");
		theEmployee.getAddress().setPin("411052");
		theEmployee.getJoiningDate().setDay(10);
		theEmployee.getJoiningDate().setMonth(5);
		theEmployee.getJoiningDate().setYear(2021);
		theEmployee.setName("Parth");
		System.out.println(theEmployee);
		
		
		Student student = context.getBean("student", Student.class);
		student.getAdmissionDate().setDay(15);
		student.getAdmissionDate().setMonth(9);
		student.getAdmissionDate().setYear(2020);
		student.getBirthDate().setDay(11);
		student.getBirthDate().setMonth(12);
		student.getBirthDate().setYear(1998);
		student.getBirthDate().setMonth(2);
		student.setName("prathamesh");
		student.setRollNumber(101);
		System.out.println(student);
		
	}

}
