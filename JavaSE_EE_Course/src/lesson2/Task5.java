package lesson2;

import java.util.Scanner;

// Read 2 numbers from the console and print all the numbers in the range between the first and the second number, starting from the smaller one.
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integer numbers");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		// swapping the numbers if the first one is bigger
		if (firstNum > secondNum) {
			int helper = firstNum;
			firstNum = secondNum;
			secondNum = helper;
		}
		
		for (int i = firstNum; i <= secondNum; i++) {
			System.out.print(i + " ");
		}
	}
}
