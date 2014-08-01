package lesson3;

import java.util.Scanner;


// �� �� ������� ��������, ����� �������� ���������� ����� ����� 1 � 100 � ���� ����������� ����� ��� �� ������ �� �� ������. 
// ������ ����������� ������ ����� � < ��� > �� ������ ���� �������,����� � ����� � ��������� ��-����� ��� ��-������ �� ���������.

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Formula 1 : min + (int)(Math.random() * ((max - min) + 1));  ------> Math.random()*N [0..N)
		// Formula 2 : Random rand = new Random();
		//             int randomNum = min + rand.nextInt((max - min) + 1); ----- rand.nextInt(N)  [0...N)
		int randomNum = 1 + (int)(Math.random()*100);
		// System.out.println(randomNum);

		int userGuess;
		while (true) {
			System.out.println("Enter your guess:");
			userGuess = sc.nextInt();
			if (userGuess == randomNum) {
				System.out.println("Congrats! You finally found the number! :)");
				break;
			}
			if (userGuess < randomNum) {
				System.out.println("<");
			} else if (userGuess > randomNum) {
				System.out.println(">");
			}
		}
	}

}
