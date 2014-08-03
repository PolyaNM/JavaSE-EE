package lesson3;

// Enter two integer numbers M and N and print all numbers in the interval [M ..  N] which are divisible by :
// 1. 3 
// 2. 2 
// 3. 5

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number M: ");
		int m = sc.nextInt();
		System.out.println("Enter number N: ");
		int n = sc.nextInt();
		
		if (n < m) {
			int helper = n;
			n = m;
			m = helper;
		}
		
		String numbersDivisibleBy3 = "";
		String numbersDivisibleBy2 = "";
		String numbersDivisibleBy5 = "";
		
		for (int i = m; i <= n; i++) {
			if (i % 3 == 0) {
				numbersDivisibleBy3 += i + " ";
			}
			if (i % 2 == 0) {
				numbersDivisibleBy2 += i + " ";
			}
			if (i % 5 == 0) {
				numbersDivisibleBy5 += i + " ";
			}
		}
		
		System.out.println("Numbers divisible by 3: " + numbersDivisibleBy3);
		System.out.println("Numbers divisible by 2: " + numbersDivisibleBy2);
		System.out.println("Numbers divisible by 5: " + numbersDivisibleBy5);
	
	}

}
