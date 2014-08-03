package lesson3;

import java.util.Scanner;

// Read 3 numbers, then another 3 and so on until the entered 3 numbers cannot fulfill the condition for being sides of a triangle. 
// Print the biggest perimeter.

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		double biggestPerimeter = 0;
		boolean triangleIsFound = false;

		while (true) {
			System.out.println("Enter sides A, B and C of a triangle: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();

			if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
				triangleIsFound = true;
				if (a + b + c > biggestPerimeter) {
					biggestPerimeter = a + b + c;
				}
			} else {
				break;
			}
		}

		if (triangleIsFound) {
			System.out.println("Biggest perimeter: " + biggestPerimeter);
		} else {
			System.out.println("No valid triangle was found");
		}

	}

}
