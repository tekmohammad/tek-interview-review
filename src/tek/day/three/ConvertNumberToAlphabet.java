package tek.day.three;

public class ConvertNumberToAlphabet {
	
	//Convert any int number to English Alphabet. 
	// 100 -> One Hundred  | 15 -> Fifteen
	// to have an array for each index have it's english alphabet. 
	
	private static final String[] nums = {"", "one", "two", "three" , "four", "five", "Six", "seven", "eight", 
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen"};
	
	private static final String[] tens = {"","ten", "twenty", "thirty", "fourty", "fifty", "sixty", 
			"seventy", "eighty", "ninety"};
	
	private static String convert(int number) {
		String result = ""; 
		// first check the number is less that 20. 
		if (number % 100 < 20) {
			int remainder = number % 100; 
			result = nums[remainder];
			number = number / 100;
		} else {
			//for numbers greater than 20 and less than 100
			//finding ones
			result = nums[number %10]; 
			number = number / 10; //3
			//finding tens
			result = tens[number%10] + " " + result ;
			number = number / 10;
		}
		if (number == 0) {
			return result;
		}else {
			//finding hundreds
			// for number greater than 100 and less than 999
			return result = nums[number] + " hundred " + result;
		}
			 		
	
	}
	
	public static void main(String[] args) {
		
		String converted = convert(100);
		System.out.println(converted);
	}
	

}
