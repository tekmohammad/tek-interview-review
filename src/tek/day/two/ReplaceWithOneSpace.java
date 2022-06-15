package tek.day.two;

public class ReplaceWithOneSpace {

	public static void main(String[] args) {
		String text = "Hello991231Worlds";
		// Replace numbers with only 1 single space.
		String replaced = text.replaceAll("[0-9]", " ").replaceAll("\\s+", " ");
		System.out.println(replaced);
	}
}
