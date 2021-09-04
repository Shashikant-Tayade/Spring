package in.happycoding.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component (value = "sms")  // here value is for id

@Scope (value = "prototype")

public class Sms {

	private String message;

	public Sms() {
		super();
	}

	
	
	public Sms(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "Sms [message = " + message + "]";
	}
	
	
	
}
