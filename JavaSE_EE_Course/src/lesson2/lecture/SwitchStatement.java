package lesson2.lecture;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// switch - int, String or enum
		System.out.println("Please add number of month");
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("This is the first quarter of the year");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;

		default:
			System.out.println("Not supposed to be here!");
			break;
		}
	}

}
