package lesson3;

// Make a program that reads numbers until a negative number is entered. 
// Print all even numbers (without the negative one).


import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several numbers.");
		int evenNumbersCounter = 0;
		double num;

		while (true) {
			num = sc.nextInt();
			if (num < 0) {
				break;
			}
			if (num % 2 == 0) {
				evenNumbersCounter++;
			}
		}
		System.out.println("There are " + evenNumbersCounter + " even numbers entered.");
	}

}
