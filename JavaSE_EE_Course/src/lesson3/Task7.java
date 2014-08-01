package lesson3;

// Да се състави програма, която въвежда 2 числа M и N от клавиатурата и отпечатва:
// - сумата на всички числа в интервала; 
// - произведението им.

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number M: ");
		int m = sc.nextInt();
		System.out.println("Please enter number N: ");
		int n = sc.nextInt();
		
		if (m > n){
			int helper = m;
			m = n;
			n = helper;
		}
		
		int sum = 0;
		long product = 1;

		for (int i = m; i <= n; i++) {
			sum +=i;
			product *=i;
		}
		
		System.out.println("The sum of all numbers is " + sum);
		System.out.println("The product of all numbers is " + product);
	}

}
