package lesson3;

// Print the sum of N numbers. When each of the numbers is entered - print on the console how many numbers are left to be entered.

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the number of integers to be entered");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Error! N must be an integer number > 0! Please enter the number again.");
			n = sc.nextInt();
		}

		int sum = 0;
		System.out.println("Please enter " + n + " numbers");

		for (int i = 1; i <= n; i++) {
			int nextNum = sc.nextInt();
			System.out.println((n - i) + " numbers left");
			sum += nextNum;
		}
		System.out.println("The sum of all numbers is: " + sum);
	}
}
