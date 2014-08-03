package lesson3;

// Enter 2 numbers M and N and print all numbers in the interval [M .. N].

import java.util.Scanner;

public class Task6 {

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

		for (int i = m; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

}
