package lesson3;

//Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и :
//- Отпечатва най-голямото
//- Отпечатва най-малкото
//- Отпечатва най-голямото нечетно число

import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several integer numbers.");

		int biggestNum = sc.nextInt();
		int smallestNum = biggestNum;
		int biggestUnevenNum = 1;
		boolean unevenNumberFound = false;

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

			if (!unevenNumberFound && (num % 2 != 0)) {
				biggestUnevenNum = num;
				unevenNumberFound = true;
			} else if ((num % 2 != 0) && (biggestUnevenNum < num)) {
				biggestUnevenNum = num;
			}

		}

		System.out.println("The biggest number is: " + biggestNum);
		System.out.println("The smallest number is: " + smallestNum);

		if (unevenNumberFound) {
			System.out.println("The biggest odd number is: " + biggestUnevenNum);
		} else {
			System.out.println("There is no odd number among the entered integers!");
		}

	}

}
