package lesson3;

// Напишете програма, която при въвеждане на дадено цяло число извежда цифрите му в обратен ред на конзолата.

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
