package in.happycoding.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.DAO.PersonDAO;
import in.happycoding.bean.Person;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		PersonDAO  personDAO = context.getBean("personDAO", PersonDAO.class);
		
		String name = personDAO.getNameById(101);
		System.out.println("Name is : "+name);
		
		int id = personDAO.getIdByName("Shashikant");
		System.out.println("Id is : "+id);
		
		int count = personDAO.getCount();
		System.out.println("Count : "+count);
		
		
		Person person = new Person(100, "Gaurav", "Gorale", "1013");
		personDAO.save(person);
		System.out.println("Record Saved ... "+person);
	}

}
