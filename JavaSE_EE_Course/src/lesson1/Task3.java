package lesson1;

import java.util.Scanner;

//Enter two numbers and swap their values;
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before the swap A = " + a + " and B = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After the swap A = " + a + " and B = " + b);
	}
}
