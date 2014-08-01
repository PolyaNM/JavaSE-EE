package lesson3;

import java.util.Scanner;

// �� �� �������� 2 �����, ����� �� ������� � ����. �� �� ������� ���� �� ������ ������� �� �� �������� � ������� ������ ����������������.
// ������ 1454543534 - 5435     YES

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long firstNum = sc.nextLong();
		long secondNum = sc.nextLong();

		// if the numbers are negative, we turn them into positive by multiplying with -1.
		if (firstNum < 0) {
			firstNum *= -1;
		}
		if (secondNum < 0) {
			secondNum *= -1;
		}

		// firstNum is BIGGER than secondNum. If not, we switch their values.
		if (firstNum < secondNum) {
			long helper = firstNum;
			firstNum = secondNum;
			secondNum = helper;
		}

		long firstNumDivider = 1;
		long secondNumDivider = 1;
		boolean numberIsFound = false;

		while (true) {
			if (secondNumDivider > secondNum) {
				numberIsFound = true;
				break;
			}
			if (firstNumDivider > firstNum) {
				break;
			}

			if ((firstNum / firstNumDivider) % 10 == (secondNum / secondNumDivider) % 10) {
				secondNumDivider *= 10;
			} else {
				secondNumDivider = 1;
			}
			firstNumDivider *= 10;
		}

		if (numberIsFound) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
