package in.happycoding.Test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Laptop;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Laptop laptop5 = context.getBean("laptop5", Laptop.class);
		System.out.println(laptop5);
				
		
		Laptop laptop = context.getBean("laptop", Laptop.class);
		System.out.println(laptop);
		
		Laptop laptop1 = context.getBean("laptop1", Laptop.class);
		System.out.println(laptop1);
		
		Laptop laptop2 = context.getBean("laptop2", Laptop.class);
		System.out.println(laptop2);
		
		
		Laptop laptop3 = context.getBean("laptop3", Laptop.class);
		System.out.println(laptop3);
		
		
		
		
	}
}
