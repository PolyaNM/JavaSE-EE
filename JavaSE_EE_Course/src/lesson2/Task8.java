package lesson2;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter integer number A:");
		int a = sc.nextInt();
		System.out.print("Please enter integer number B:");
		int b = sc.nextInt();
		long sum = 0;
		
			for (int i = a; i <= b; i++) {
				int product = i * i;
				if ((product) % 3 != 0) {
					sum += product;
					if (sum > 200) {
						break;
					}
					System.out.print(product + ", ");
					
				} else {
					System.out.print("skip " + i + ", ");
				}
			}

	}
}
