package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Car;
import in.happycoding.bean.Dog;
import in.happycoding.bean.Employee;
import in.happycoding.bean.Train;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee e = context.getBean("Employee", Employee.class);
		e.setRoll(1);
		e.setFirstname("Shashikant");
		e.setLastname("Tayade");
		
		System.out.println(e);
		
		Car car = context.getBean("Car", Car.class);
		
		car.setNum_of_wheels(4);
		car.setColour("Blue");
		
		System.out.println(car);
		
		Dog dog = context.getBean("Dog", Dog.class);
		dog.setColour("Golden");
		dog.setBreed("Labrador");
		
		System.out.println(dog);
		
		
		Train train = context.getBean("Train", Train.class);
		train.setTrain_no("078783");
		train.setTrain_name("Hatia SF");
		
		System.out.println(train);
		
	}
	
	
}
