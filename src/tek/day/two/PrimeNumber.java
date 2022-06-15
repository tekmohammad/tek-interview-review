package tek.day.two;

public class PrimeNumber {
	/*
	 * Prime Number. 
	 */
	public static void main(String[] args) {
		
		//example 7 is prime number. 1  and 7 /
		// 6 is not prime number -> 1 , 2 , 3, 6; 
		// check all the number between 1 to 100 and print the prime numbers. 
		
		for (int number = 1 ; number <= 100 ; number ++) {
			checkPrimeNumber(number);
		}
	}

	private static void checkPrimeNumber(int number) {
		//for loop to divide the given number with all the previous numbers. 
		// We have to count how many time the number have 0 reminder.
		int counter = 0; 
		for (int i = 1 ; i <= number; i ++ ) {
			if (number % i == 0) {
				counter ++;
			}
		}
		
		if (counter == 2 ) {
			System.out.println("The number " + number + " is prime number");
		} else {
			System.out.println("The number " + number + " is not prime number");
		}
	}
} 
