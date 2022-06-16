package tek.day.three;

import java.util.HashMap;
import java.util.Map;

public class ConvertingNumberToAlphaWithMap {
	
	private static Map<Integer, String> onesMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Ninetee");
		return map; 
	}
	private static Map<Integer, String> tensMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ten");
		map.put(2, "Twenty");
		map.put(3, "Thirty");
		map.put(4, "Fourty");
		map.put(5, "Fifty");
		map.put(6, "Sixty");
		map.put(7, "Seventy");
		map.put(8, "Eighty");
		map.put(9, "Ninty");
		return map; 
	}
	
	private static String convert(int number) {
		String result = ""; 
		// first check the number is less that 20. 
		if (number % 100 < 20) {
			int remainder = number % 100; 
			result = onesMap().get(remainder);
			number = number / 100;
		} else {
			//for numbers greater than 20 and less than 100
			//finding ones
			result = onesMap().get(number % 10); 
			number = number / 10;
			//finding tens
			result = tensMap().get(number % 10) + " " + result ;
			number = number / 10;
		}
		if (number == 0) {
			return result;
		}else {
			//finding hundreds
			// for number greater than 100 and less than 999
			return result = onesMap().get(number) + " hundred " + result;
		}
	}
	
	public static void main(String[] args) {
		String converted = convert(143);
		System.out.println(converted);
	}
	

}
