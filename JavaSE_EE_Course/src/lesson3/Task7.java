package lesson3;

// Enter two integer numbers M and N. Print: 
// - the sum of all integer numbers in the interval [M .. N] 
// - the product of all integer numbers in the interval [M .. N] 

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number M: ");
		int m = sc.nextInt();
		System.out.println("Please enter number N: ");
		int n = sc.nextInt();
		
		if (m > n){
			int temp = m;
			m = n;
			n = temp;
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
