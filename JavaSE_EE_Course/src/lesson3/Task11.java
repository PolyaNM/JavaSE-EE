package lesson3;

// �� �� ������� ��������, ����� ���� �� ������������ ����� � � ���� ���� �������� �� �����, ������ ����� �� �� ����� ��-����� ��� ����� �� K , 
// ���� ����� ������� �� ��������� ���� �� ���������� ���� K ����� � ������ ������������� �� ������ ��.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter K = ");
		double k = sc.nextDouble();

		int enteredNumbersCount = 0;
		double sum = 0;
		while (sum < k) {
			double nextNum = sc.nextDouble();
			sum += nextNum;
			enteredNumbersCount++;
		}

		double avarage = sum / enteredNumbersCount;
		
		System.out.println("The number of entered numbers after K is : " + enteredNumbersCount);
		System.out.println("Avarage : " + avarage);
	}
}
