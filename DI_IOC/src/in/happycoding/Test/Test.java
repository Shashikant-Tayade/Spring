package in.happycoding.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Car;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car theCar = context.getBean("car", Car.class);
		theCar.run();
		
	}
}
