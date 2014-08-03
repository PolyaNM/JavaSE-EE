package lesson3;

// Make a program that reads numbers until 0 is entered. Print how many negative numbers have been entered.

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several numbers.");
		int negativeNumbersCount = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num < 0) {
				negativeNumbersCount++;
			}
		}
		System.out.println("There are " + negativeNumbersCount + " negative numbers.");
	}

}
