package lesson3;

// Weightlifting contest. N contestants. Each of these contestants has result and weight. If two contestants have the same result, 
// the winner is the one who is lighter. Print the number of the winner in the contest.

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
