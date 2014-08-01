package lesson2;

import java.util.Scanner;

public class Task6 {

	// Read a number from the console and calculate the sum of all numbers between 1 and the given number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please one integer number");
		int num = sc.nextInt();
		long sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("The sum of the numbers is " + sum);
	}

}
