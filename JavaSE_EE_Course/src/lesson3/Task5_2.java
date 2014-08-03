package lesson3;

// Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и :
// - Отпечатва най-голямото
// - Отпечатва най-малкото
// - Отпечатва най-голямото нечетно число

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
