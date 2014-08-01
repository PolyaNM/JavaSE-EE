package lesson3;

// Да се състави програма която да чете числа от клавиатурата до въвеждане на отрицателно число 
// и отпечатва броя на четните числа без отрицателното.

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several numbers.");
		int evenNumbersCounter = 0;

		while (true) {
			double num = sc.nextInt();
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
