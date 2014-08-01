package lesson3;

import java.util.Scanner;


// Да се направи програма, която генерира произволно число между 1 и 100 и пита потребителя всеки път да пробва да го познае. 
// Когато потребителя въведе число с < или > му указва дали числото,което е въвел е съответно по-малко или по-голямо от търсенето.

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
