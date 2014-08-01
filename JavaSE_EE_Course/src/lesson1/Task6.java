package lesson1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Before the swap A B C: " + a + " " + b + " " + c);
		
		a = a + b + c;
		c = a - (b + c); // c = a
		b = a - (b + c); // b = c
		a = a - (b + c); // a = b
		
		System.out.println("After the swap A B C: " + a + " " + b + " " + c);
	}
	
}
