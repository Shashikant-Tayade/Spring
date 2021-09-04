package in.happycoding.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect

public class NotificationService {

//	@Before("execution(* admission() )")      we can use Before to send notification before method execution
	
	@After("execution(* admission() )")
	public void sendNotification()
	{
		System.out.println("Admission Done!...");
	}
	
}
