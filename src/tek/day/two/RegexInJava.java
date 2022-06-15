package tek.day.two;

public class RegexInJava {

	// Regular Expression. (Regex)
	// [a-z] -> a to z all alphabet in lowercase.
	// [A-Z] -> A to Z all alphabet in UPPERCASE.
	// [0-9] -> 0 to 9 for numbers.
	// [a-zA-Z0-9] -> mix of all character regex.
	// [^a-z] -> NOT a to z lowercase.
	public static void main(String[] args) {
		String text = "Hello991231Worlds";
		// Replace numbers from this string with empty character.
		
		String afterReplaced = text.replaceAll("[0-9]", "");
		System.out.println(afterReplaced);
		
		String text1 = "AllThisLetters";
		//replace all the upper case letters with empty character. 
		String text1Replaced = text1.replaceAll("[A-Z]", "");
		System.out.println(text1Replaced);
		
		//replace all the lower case letter with empty character.
		String replaceLowerCaseLetters = text1.replaceAll("[a-z]", "");
		System.out.println(replaceLowerCaseLetters);
		
		
	}

}
