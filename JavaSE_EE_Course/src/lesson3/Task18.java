package lesson3;

import java.util.Scanner;

// Да се състави програма, която чете от клавиатурата ест число N <= 27 и 
// отпечатва броя на естествените трицифрени числа, със сума на цифрите по-голяма от N.

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		// Checking if the input is a valid integer number in the range [1 .. 27]
		while (true) {
			System.out.println("Enter an integer number in the range [1 .. 27]");
			n = sc.nextInt();
			if (n >=1 && n <= 27) {
				break;
			}
			System.out.println("Error! Invalid input!");
		}
		
		// Solution
		int counter = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int h = 0; h <= 9; h++) {
					if (i + j + h > n) {
						// System.out.println(i + "" + j + "" + h);
						counter++;
					}
				}
			}
		}	
		
		System.out.println(counter + " number(s).");
		
		

	}

}
