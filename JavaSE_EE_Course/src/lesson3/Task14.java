package lesson3;

// На състезание по вдигане на тежести при равни резултати се класира по-лекия сътезател. 
// Напишете програма, която да приема от клавиатурата брой на състезателите , резултат и тегло на сътезателя 
// и извежда поредния ниомер на победителя в състезанието.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of contestants: ");
		int numberOfContestants = sc.nextInt();
		int result = 0;
		double weight = 0;
		int numberOfWinner = 0;

		int nextContestantResult;
		double nextContestantWeight;

		for (int i = 1; i <= numberOfContestants; i++) {
			System.out.println("Enter the result of the contestant: ");
			nextContestantResult = sc.nextInt();
			System.out.println("Enter the weight of the contestant: ");
			nextContestantWeight = sc.nextDouble();

			if (nextContestantResult > result) {
				numberOfWinner = i;
			} else if (nextContestantResult == result && nextContestantWeight < weight) {
				numberOfWinner = i;
			}

			result = nextContestantResult;
			weight = nextContestantWeight;
		}

		System.out.println("The number of the winner is: " + numberOfWinner);

	}

}
