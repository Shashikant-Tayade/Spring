package in.happycoding.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class NotificationService
{
//	@After("execution(* admission() )")
	
	@Pointcut("execution (* in.happycoding.bean.University.*() )")
	
	public void universityPointCut()
	{
		
	}
	
	@After("universityPointCut()")
	
	public void sendNotification()
	{
//		System.out.println("Admission Done...");
		System.out.println("Sending Notification...");
	}
	
	
	
	
}
