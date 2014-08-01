package lesson3;

import java.util.Scanner;

// �� �� ������� ��������� �� ������� - ����������� �� ������� ����� �� 1 �� 100, � �������� �� ���� �� ����� ����� 
// � ����������� �������� � < ��� >. ����� � � ��������� ���� ������ �� �� ������ �����������.

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guessNum;
		String userInput;
		int guessesCount = 0;
		int start = 1;
		int end = 100;
		
		while (true) {
			guessNum = start + ((end - start) / 2);
			System.out.println(guessNum);
			
			userInput = sc.nextLine();
			if (userInput.equals("yes")) {
				break;
			}

			if (userInput.equals(">")) {
				end = guessNum;
			} 
			else if (userInput.equals("<")) {
				start = guessNum;
			}
			guessesCount++;
		}
		System.out.println("Number found with " + guessesCount + " guesses!");
	}

}
