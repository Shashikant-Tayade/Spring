package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Bike;
import in.happycoding.bean.Employee;
import in.happycoding.bean.Laptop;
import in.happycoding.bean.TV;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp = context.getBean("Employee", Employee.class);
		System.out.println(emp);
		
		Laptop lappy = context.getBean("Laptop", Laptop.class);
		System.out.println(lappy);
		
		
		Bike bike = context.getBean("Bike", Bike.class);
		System.out.println(bike);
		
		
		TV tv = context.getBean("TV", TV.class);
		System.out.println(tv);
		
		
		
		
		Employee emp1 = context.getBean("Employee1", Employee.class);
		
		emp1.setId(102);
		emp1.setFirstName("Ashwini");
		emp1.setLastName("Shinde");
		
		System.out.println(emp1);
	}
}
