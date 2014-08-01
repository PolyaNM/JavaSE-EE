package lesson3;

// Да се състави програма, която въвежда 2 числа M и N от клавиатурата и отпечатва всички числа в интервала M и N.

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
