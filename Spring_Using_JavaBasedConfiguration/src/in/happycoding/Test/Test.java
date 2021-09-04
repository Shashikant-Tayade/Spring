package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.happycoding.bean.Sms;
import in.happycoding.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Sms sms = context.getBean("sms", Sms.class);
		sms.setMessage("Welcome to the World of Coding...");
		System.out.println(sms);
		
		Sms sms2 = context.getBean("sms", Sms.class);
		sms2.setMessage("Welcome to Java...");
		System.out.println(sms2);
	}
	
}
