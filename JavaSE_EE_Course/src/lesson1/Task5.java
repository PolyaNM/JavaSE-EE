package lesson1;

import java.util.Scanner;

//Enter 3 numbers from the console and print them in descending order
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("The numbers in descending order are: ");

		if (a > b) {
			if (a > c) {
				if (c > b) {
					System.out.print(a + " " + c + " " + b);
				} else {
					System.out.print(a + " " + b + " " + c);
				}
			} else {
				System.out.print(c + " " + a + " " + b);
			}
		} else {
			if (a < c) {
				if (c > b) {
					System.out.print(c + " " + b + " " + a);
				} else {
					System.out.print(b + " " + c + " " + a);
				}
			} else {
				System.out.print(b + " " + a + " " + c);
			}
		}
	}
	
}
