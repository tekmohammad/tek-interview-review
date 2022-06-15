package tek.day.one;

public class TernaryOperatorExample {
	
	public static void main(String[] args) {
		//Ternary Operator ? mark with an example. 
		int age = 20; 
		String message= ""; 
		//if age less that 21 not allowed to drink alcohol else you are allowed. 		
		// condition ? expresion1 : expresion2;
		message = (age < 21 ) ? "Not allowed to drink Alcohol" : "Allowed to drink alcohol";
		System.out.println(message);
	}

}
