package lesson3;

import java.util.Scanner;

// �� �� ������� �������� , ����� ��� �������� �� ������������ ���������� ����� N 
// ������� �� ������ ���� �� ������ 3- ������� ����� ��-����� �� N , ����� �� �������� ������� �����.

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		// Checking if the input is valid
		while (true) {
			System.out.println("Enter an integer number >=1");
			n = sc.nextInt();
			if (n >= 1) {
				break;
			}
			System.out.println("Error! Invalid input!");
		}

		// Solution
		int counter = 0;
		if (n < 100) {
			System.out.println("No such numbers!");
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					for (int h = 0; h <= 9; h++) {
						if (i != j && i != h && j != h) {
							if ((i * 100 + j * 10 + h) < n) {
								// System.out.println(i + "" + j + "" + h);
								counter++;
							}
						}
					}
				}
			}
		}

		System.out.println(counter + " number(s).");
	}

}
