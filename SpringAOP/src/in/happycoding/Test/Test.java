package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.University;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");

		University sppu = context.getBean("u1", University.class);
		sppu.admission();
		
	}

}
