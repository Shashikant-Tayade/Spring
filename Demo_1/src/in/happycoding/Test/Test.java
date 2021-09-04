package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Date;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Date date = context.getBean("date", Date.class);
		Date date2 = context.getBean("date", Date.class);
		
		System.out.println(date);
		System.out.println(date2);
	}

}
