package lesson1;

import java.util.Scanner;

// Enter 2 numbers from the console and print them in ascending order
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}

		System.out.println("The numbers in ascending order are: " + a + " and " + b);
	}

}
