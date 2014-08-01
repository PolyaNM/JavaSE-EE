package lesson1;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Locale loc = new Locale("en_US");
		Locale.setDefault(loc);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integer numbers!");
		System.out.print("A = ");
		int a = sc.nextInt();
		System.out.print("B = ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("A + B = " + sum);
		int substraction = a - b;
		System.out.println("A - B = " + substraction);
		int division = a / b;
		System.out.println("A / B = " + division);
		int product = a * b;
		System.out.println("A * B = " + product);
		int remainder = a % b;
		System.out.println("A % B = " + remainder);

		System.out.println("Please enter two floating point numbers!");
		System.out.print("C = ");
		double c = sc.nextDouble();
		System.out.print("D = ");
		double d = sc.nextDouble();

		double sumFloat = c + d;
		System.out.println("C + D = " + sumFloat);
		double substractionFloat = c - d;
		System.out.println("C - D = " + substractionFloat);
		double divisionFloat = c / d;
		System.out.println("C / D = " + divisionFloat);
		double productFloat = c * d;
		System.out.println("C * D = " + productFloat);
		double remainderFloat = c % d;
		System.out.println("C % D = " + remainderFloat);
	}
	
}
