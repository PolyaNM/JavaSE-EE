package lesson3;

// Enter an integer number and print its digits in reverse order.

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas eenter a number.");
		int number = sc.nextInt();

		// First Method - modifying the input
		// String numAsString = "";
		// while (number > 0) {
		// numAsString += number % 10;
		// number = number / 10;
		// }
		// System.out.println(numAsString);

		// Second method - without modifying the input
		long divider = 1;
		while (divider < number) {
			System.out.print((number / divider) % 10);
			divider *= 10;
		}

	}

}
