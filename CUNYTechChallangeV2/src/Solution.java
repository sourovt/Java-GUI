import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			System.out.println(i);
			if (i % 3 <= 0) {
				System.out.println("Fizz");
			}
			if (i % 5 <= 0) {
				System.out.println("Buzz");
			}
			if (i % 3 <= 0 && i % 5 <= 0) {
				System.out.println("FizzBuzz");
			}
		}
	}
}