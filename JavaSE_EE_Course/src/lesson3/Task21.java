package lesson3;

import java.util.Scanner;

// Да се направи обратната на първата - потребителя си намисля число от 1 до 100, а програма го пита за разни числа 
// и потребителя отговаря с < или >. Целта е с минимален брой ходове да се познае намисленото.

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
