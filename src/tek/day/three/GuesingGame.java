package tek.day.three;

import java.util.Scanner;

public class GuesingGame {

	// Java will randomly pick a number in a range 0 - 50;
	// then we have to guess the number. by scanner inputs.
	public static void main(String[] args) {
		// Random number by Java. 
		int random = (int) (Math.random() * 50); // random number between 0 - 1;
		
		// Guessing part.
		Scanner scanner = new Scanner(System.in);
		boolean isGuessed = false;
		// we have to get input until we find the number.
		while (!isGuessed) {
			System.out.println("Guess a number between 0 - 50 ?? ");
			int userInput = scanner.nextInt();
			
			//condition to check if number is guessed. 
			if (userInput == random) {
				System.out.println("Good Job you find the number");
				isGuessed = true;
			} else if (userInput < random) {
				System.err.println("Choose a higher number");
			} else if (userInput > random) {
				System.err.println("Choose a lower number");
			}
		}
		
		scanner.close();
	}
}
