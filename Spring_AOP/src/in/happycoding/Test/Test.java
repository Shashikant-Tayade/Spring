package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.bean.Bank;
import in.happycoding.bean.University;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		University sppu = context.getBean("university", University.class);
		
		sppu.admission();
		sppu.leaveUniversity();
		sppu.transfer();
		
		
//		Bank bank = context.getBean("bank", Bank.class);
//		bank.withdraw();
		
		
	}

}
