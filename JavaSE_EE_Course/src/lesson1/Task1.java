package lesson1;

import java.util.Scanner;
import java.util.Locale;

public class Task1 {

	public static void main(String[] args) {
		Locale loc = new Locale("en_US");
		Locale.setDefault(loc);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number A: ");
		double a = sc.nextDouble();
		System.out.println("Please enter number B: ");
		double b = sc.nextDouble();
		System.out.println("Please enter number C: ");
		double c = sc.nextDouble();

		// Swapping a with b if a > b;
		if (b < a) {
			b = a + b;
			a = b - a;
			b = b - a;
		}
		
		 if (a < c && c < b) {
		 System.out.println("Number " + c + " is between " + a + " and " + b);
		 }
		 else {
		 System.out.println("Number " + c + " is between " + a + " and " + b);
		 }
	}

}
