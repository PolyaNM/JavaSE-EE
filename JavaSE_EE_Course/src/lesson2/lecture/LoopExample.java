package lesson2.lecture;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		// // print all even numbers between 1 and 50;
		// int num = 2;
		// while (num <= 50) {
		// System.out.println(num);
		// num +=2;
		// }

		// Print all numbers from 1 to n divisible by 7;
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);

		// New task
		// int n = sc.nextInt();
		// int row = 1;
		// int counter = 1;
		//
		// while (row <= n) {
		// int col = 1;
		// int helper = row;
		// while (col <= n) {
		// System.out.print(helper + " ");
		// helper += row;
		// col++;
		// }
		// System.out.println();
		// col = 1;
		// row++;
		// }

		// TASK: Input - integer number
		// if 3 is entered, print 3 3 3 !;
		// if 7 - 7 7 7 7 7 7 7 !;
		// while (true) {
		// System.out.println("Enter a number!");
		// int n = sc.nextInt();
		//
		// for (int i = 0; i < n; i++) {
		// System.out.print(n + " ");
		// }
		// System.out.println("!");
		//
		// }

		// TASK - N factoriel
		// int num = sc.nextInt();
		// long fact = 1;
		// for (int i = 1; i <= num; i++) {
		// fact *= i;
		// }
		// System.out.println(fact);

		// TASK - Sum of n numbers in fibonacci sequence
		int num = sc.nextInt();
		int first = 0;
		int sec = 1;
		int nextNumber;
		System.out.print("0" + " 1");
		for (int i = 2; i < num; i++) {
			nextNumber = first + sec;
			System.out.print(" " + nextNumber);
			first = sec;
			sec = nextNumber;
		}

	}

}
