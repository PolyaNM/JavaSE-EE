package lesson3;

import java.util.Scanner;

public class Task22_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long first = sc.nextLong();
		long second = sc.nextLong();

		if (first < second) {
			long temp = first;
			first = second;
			second = temp;
		}

		// counting the number of digits in the smaller ones
		long divider;
		for (divider = 1; second / divider != 0; divider *= 10) {
		}
		System.out.println("divider = " + divider);

		boolean exists = false;
		while (first >= divider / 10) {
			if ((first % divider == second)
					|| (first < divider && first == second)) {
				exists = true;
				break;
			} else {
				first = first / 10;
			}
		}

		if (exists) {
			System.out.println("Exists");
		} else {
			System.out.println("Doesn't exist");
		}

	}

}
