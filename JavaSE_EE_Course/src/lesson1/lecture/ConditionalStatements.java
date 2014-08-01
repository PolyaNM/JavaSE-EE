package lesson1.lecture;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two digits!");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();

		if (firstNum > 30) {
			System.out.println("Please enter another number!");
			int third = sc.nextInt();
			System.out.println(firstNum + ", " + secondNum + ", " + third);
		} else {
			System.out.println(firstNum + secondNum);
		}

	}
}
