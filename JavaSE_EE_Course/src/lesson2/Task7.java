package lesson2;

import java.util.Scanner;

public class Task7 {

	// Read a number N from the console and print N numbers starting from 3 that are divisible by 3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one integer number");
		int n = sc.nextInt();
		int firstNum = 3;

		for (int i = 1; i <= n; i++) {
			System.out.print(firstNum + " ");
			firstNum += 3;
		}
	}
}
