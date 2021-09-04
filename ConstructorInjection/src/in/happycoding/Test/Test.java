package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Car;

public class Test 
{
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//	This is for Constructor Injection
	Car thecar1 = context.getBean("car", Car.class);
	System.out.println("By Constructor Injection...");
	System.out.println(thecar1);
	
	System.out.println();
	
//	This is for Setter Injection
	Car thecar2 = context.getBean("car2", Car.class);
	System.out.println("By Setter Injection...");
	System.out.println(thecar2);
	
	}
	
}
