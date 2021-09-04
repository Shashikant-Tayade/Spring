package in.happycoding.Test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.happycoding.DAO.PersonDAO;
import in.happycoding.bean.Person;

public class Test {

	public static void main(String[] args) {
		
		
ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		PersonDAO  personDAO = context.getBean("personDAO", PersonDAO.class);
		
//		
//		String name = personDAO.getNameById(101);
//		System.out.println("Name is : "+name);
//		
//		int id = personDAO.getIdByName("Shashikant");
//		System.out.println("Id is : "+id);
//		
//		int count = personDAO.getCount();
//		System.out.println("Count : "+count);
		
		
//		Person person = new Person(104, "Saurabah", "Gorule", "1014");
//		personDAO.save(person);
//		System.out.println("Record Saved...\n"+person);
//		
//		personDAO.update("Jannat", 100);
//		System.out.println("Record Updated...");
		
//		personDAO.deleteById(104);
//		System.out.println("Record Deleted Successfully... ");
		
		
//		Person person = personDAO.getById(101);
//		System.out.println(person);
		
		List<Person> people = personDAO.getAll();
		for(Person p : people)
		{
			System.out.println(p);
			
		}
		
	}

}
