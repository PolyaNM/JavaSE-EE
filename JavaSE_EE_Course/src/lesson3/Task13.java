package lesson3;

// Make a program that reads numbers and prints the biggest negative number.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		boolean hasNegativeValue = false;

		while (true) {
			System.out.println("Please enter a number!");
			int input = sc.nextInt();

			if (!hasNegativeValue && input < 0) {
				max = input;
				hasNegativeValue = true;
			} else if (input < 0 && max < input) {
				max = input;
			}

			if (hasNegativeValue) {
				System.out.println(max);
			} else {
				System.out.println("No negative input yet!");
			}

		}

	}

}
