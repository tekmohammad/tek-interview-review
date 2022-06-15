package tek.day.two;

public class RegexInJava2 {

	// Regular Expression. (Regex)
	// [a-z] -> a to z all alphabet in lowercase.
	// [A-Z] -> A to Z all alphabet in UPPERCASE.
	// [0-9] -> 0 to 9 for numbers.
	// [a-zA-Z0-9] -> mix of all character regex.
	// [^a-z] -> NOT a to z lowercase.
	
	public static void main(String[] args) {
		String text = "salfkj21l412AD(&%#&*";
		//keep the alphabet letter only?
		String onlyAlphabet = text.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(onlyAlphabet);
	}

}
