package lesson3;

// �� �� ������ ��������, ����� ������ ����� �� ������������ �� ��������� �� 0 � ������� ���� �� ���������� ����������� �����.

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter several numbers.");
		int negativeNumbersCount = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num < 0) {
				negativeNumbersCount++;
			}
		}
		System.out.println("There are " + negativeNumbersCount + " negative numbers.");
	}

}
