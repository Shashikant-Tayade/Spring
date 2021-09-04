package in.happycoding.bean;

import org.springframework.stereotype.Component;

@Component

public class Date {

	private int date;
	private int day;
	private int year;
	
	public Date() {
		super();
	}

	public Date(int date, int day, int year) {
		super();
		this.date = date;
		this.day = day;
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [date=" + date + ", day=" + day + ", year=" + year + "]";
	}
	
	
	
}
