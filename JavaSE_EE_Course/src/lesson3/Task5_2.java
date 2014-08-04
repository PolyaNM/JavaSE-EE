package lesson3;

// Make a program that reads numbers until 0 is entered AND :
//- Prints the biggest one
//- Prints the smallest one
//- Prints the biggest odd numbers

import java.util.Scanner;

public class Task5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int biggestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		int biggestOddNumber = Integer.MIN_VALUE;
		boolean oddNumberFound = false;

		while (true) {
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}

			if (input > biggestNum) {
				biggestNum = input;
			}

			if (input % 2 != 0) {
				if (!oddNumberFound) {
					biggestOddNumber = input;
					oddNumberFound = true;
				} else if (input >= biggestOddNumber) {
					biggestOddNumber = input;
				}
			}

			if (input < smallestNum) {
				smallestNum = input;
			}

		}

		System.out.println("The biggest number is: " + biggestNum);
		System.out.println("The smallest number is: " + smallestNum);

		if (oddNumberFound) {
			System.out.println("The biggest odd number is : " + biggestOddNumber);
		} else {
			System.out.println("There is no odd number in the sequence!");
		}

	}
}
