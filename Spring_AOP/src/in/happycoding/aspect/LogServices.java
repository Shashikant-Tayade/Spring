package in.happycoding.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class LogServices 
{
	@Before("execution (* admission ())")
	public void logAdmission()
	{
		System.out.println("Admission taking place at : "+ new Date());
	}
	
	@Around("execution(* withdraw() )")
	
	public void logWithdrawActivity(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("Checking balance before ...");
		
		joinpoint.proceed();
		
		System.out.println("Checking balance after ...");
	}
	
}
