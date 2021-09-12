package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.happycoding.Config.AppConfig;
import in.happycoding.DAO.StudentDAO;

public class TestApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		String name = studentDAO.getNameById(8);
		System.out.println("Name : " +name);
		

	}

}
