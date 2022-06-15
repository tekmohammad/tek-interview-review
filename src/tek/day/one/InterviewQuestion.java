package tek.day.one;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterviewQuestion {
	//Activity
	public static void main(String[] args) throws Exception{
		//Assume this String "2022061351025"
		//Assume specification. first 8 digit is date, the rest of it is amount. 
		//Convert the string to Date and Double 
		
		// 15 minute to solve this problem?
		
		String text = "2022061351025";
		
		String dateInString = text.substring(0, 8);
		String amountInString = text.substring(8);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd"); 
		Date date = formatter.parse(dateInString);
		//Wrapper Class
		double amount = Double.parseDouble(amountInString);
		
		System.out.println(date);
		System.out.println(amount);
	}

}
