package lesson3;

// �� �� ������� ��������, ����� ���� ����� �� ������������ �� ��������� �� 0 � ��������� ������ ��.

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		while (true){
			double num = sc.nextDouble();
			if(num == 0){
				break;
			}
			sum +=num;		
		}
		System.out.println("The sum of the numbers is " + sum);
	}

}
