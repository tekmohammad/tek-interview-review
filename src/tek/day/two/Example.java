package tek.day.two;

public class Example {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0 || nums[i] % 3 == 0) {
				System.out.println(nums[i] + " is not a prime number");
			} else {
				System.out.println(nums[i] + " is a prime number.");
			}

		}
	}
}
