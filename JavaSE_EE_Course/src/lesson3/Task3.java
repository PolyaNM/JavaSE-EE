package lesson3;

// Make a program that reads numbers until 1 is entered. Print the product of the entered numbers.

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		double product = 1;
		while (true){
			double num = sc.nextDouble();
			if(num == 1){
				break;
			}
			product *=num;		
		}
		System.out.println("The product of the numbers is " + product);
	}
}
