package tek.day.two;

import java.util.Scanner;

public class PasswordCheck {
	//Password check Activity
	// the length of password should be 8 character or More, 
	// Should have at least on Upper case letter. 
	// should have at least on special character. 
	
	public static void main(String[] args) {
		// Given any password. 
		//create a functionality to check the given password. 
		//20 Minute to solve it by you :) 
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		checkPassword(password);
		
		scanner.close();
	}
	
	private static void checkPassword(String password) {
		if (password.length() < 8) {
			throw new RuntimeException("Password length is less than 8 character.");
		}else {
			String uppercaseCheck = password.replaceAll("[^A-Z]", "");
			if (uppercaseCheck.length() < 1) {
				throw new RuntimeException("Password should contain at least one Upper case letter");
			}
			
			String specialCharCheck = password.replaceAll("[a-zA-Z0-9]", "");
			
			if (specialCharCheck.length() < 1 ) {
				throw new RuntimeException("Password should contain at least one special character.");
			}
			
			System.out.println("Password Valid");
		}
	}

}
