package lesson3;

// �� �� ������� ��������, ����� ���� �� ������������ ������ �� �� 5 �����, 
// ���� ��� ��������� �� ������ ������� ������ ����� � ������� �� ��������� ������ �� ������� � ���������� ������

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int first, second, third, fourth, fifth;
		
		while(true){
			System.out.println("Enter 5 numbers: ");
			first = sc.nextInt();
			second = sc.nextInt();
			third = sc.nextInt();
			fourth = sc.nextInt();
			fifth = sc.nextInt();
			
			if (first < second && second < third && third < fourth && fourth < fifth) {
				sum = first + second + third + fourth + fifth;
				System.out.println("Sum: " + sum);
				break;
			}
		}

	}

}
