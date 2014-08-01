package lesson2;

import java.util.*;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter integer number A:");
		int a = sc.nextInt();
		boolean isPrime = true;
		
		// Method 1 - with Math.sqrt()
		// for (int i = 2; i <= Math.sqrt(a); i++) {
		// if (a % i == 0) {
		// isPrime = false;
		// break;
		// }
		// }
		
		// Method 2 - without using Math.sqrt()
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		
		if (isPrime) {
			System.out.println("The number IS prime");
		}
		else {
			System.out.println("The number IS NOT prime");
		}
	}
}
