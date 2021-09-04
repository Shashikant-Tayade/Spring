package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Date;

public class Test {
 
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	Date date = context.getBean("date", Date.class);
	
	date.setDate(27);
	date.setDay(8);
	date.setYear(2021);
	
	System.out.println(date);
	
	}
}
