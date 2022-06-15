package tek.day.two;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class GetTodaysDate {
	
	//how to get todays date in Java. 
	
	public static void main(String[] args) {
		// First Option. 
		
		// Date Object. 
		
		Date date = new Date(); 
		System.out.println(date);
		
		// LocalDate. 
		LocalDate now = LocalDate.now();
		System.out.println(now);
		int year = now.getYear();
		System.out.println(year);
		
		Month month = now.getMonth();
		System.out.println(month.name());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		
		//Local Date with Time. 
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
	}

}
