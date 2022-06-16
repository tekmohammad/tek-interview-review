package tek.day.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class InterviewQuestion {

	public static void main(String[] args) {

		String text = "dadralrlk";

		char[] arrChar = text.toCharArray();
		HashSet<Character> duplicatedList = new HashSet<>();
		for (int i = 0; i < arrChar.length; i++) {
			boolean isDuplicate = false;
			char toSearch = arrChar[i];
			if (duplicatedList.contains(toSearch)) {
				isDuplicate = true;
			} else {
				for (int j = i + 1; j < arrChar.length; j++) {
					char toCheckWith = arrChar[j];
					if (toSearch == toCheckWith) {
						duplicatedList.add(toSearch);
						isDuplicate = true;
					}
				}
			}
			if (!isDuplicate) {
				System.out.println("Found is :) " + toSearch);
				System.out.println("Index number is " + i);
				break;
			}
		}
	}

}
