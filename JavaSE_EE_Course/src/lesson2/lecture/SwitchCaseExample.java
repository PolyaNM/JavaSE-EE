package lesson2.lecture;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// number1 - year ; number2 - month
		// how many days there are in this month for this year

		Scanner sc = new Scanner(System.in);
		System.out.println("Please add year");
		int year = sc.nextInt();
		System.out.println("Please add month");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days!");
			break;
		case 2:
			if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		default:
			System.out.println("Error!No such month!");
			break;
		}
	}

}
