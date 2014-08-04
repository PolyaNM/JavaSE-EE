package lesson3;

// Make a program that reads numbers until 0 is entered AND :
//- Prints the biggest one
//- Prints the smallest one
//- Prints the biggest odd numbers

import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several integer numbers.");

		int biggestNum = sc.nextInt();
		int smallestNum = biggestNum;
		int biggestOddNumber = 0;
		boolean oddNumberFound = false;
		
		if(biggestNum % 2 != 0){
			biggestOddNumber = biggestNum;
			oddNumberFound = true;
		}

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}

			if (num > biggestNum) {
				biggestNum = num;
			}

			if (num < smallestNum) {
				smallestNum = num;
			}
			
			if (num % 2 != 0) {
				if (!oddNumberFound) {
					biggestOddNumber = num;
					oddNumberFound = true;
				}
				else{
					if (biggestOddNumber < num) {
						biggestOddNumber = num;
					}
					
				}
			}

		}

		System.out.println("The biggest number is: " + biggestNum);
		System.out.println("The smallest number is: " + smallestNum);

		if (oddNumberFound) {
			System.out.println("The biggest odd number is: " + biggestOddNumber);
		} else {
			System.out.println("There is no odd number among the entered integers!");
		}

	}

}
