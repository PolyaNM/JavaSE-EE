package lesson3;

// Make a program that reads 3 integers, then another 3 and so on until the entered 3 numbers are = 0.
// After every 3 numbers print 'Yes' if their sum is divisible by 3 and 'No' if it's not.

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter 3 numbers");
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();

			if (first == 0 && second == 0 && third == 0) {
				break;
			}

			if ((first + second + third) % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
