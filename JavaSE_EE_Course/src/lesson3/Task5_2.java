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
		int biggestUnevenNum = Integer.MIN_VALUE;

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}

			if (num > biggestNum) {
				biggestNum = num;
			}

			if ((num > biggestUnevenNum) && (num % 2 != 0)) {
				biggestUnevenNum = num;
			}
			if (num < smallestNum) {
				smallestNum = num;
			}

		}

		System.out.println("The biggest number is: " + biggestNum);
		System.out.println("The smallest number is: " + smallestNum);

		if (biggestUnevenNum == Integer.MIN_VALUE) {
			System.out.println("There is no odd number in the sequence!");
		} else {
			System.out.println("The biggest odd number is : "
					+ biggestUnevenNum);
		}

	}
}
