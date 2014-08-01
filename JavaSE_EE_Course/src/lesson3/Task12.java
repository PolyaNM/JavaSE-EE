package lesson3;

// С цел сформиране на отбори от 3-ма участници била разработена анкета с точки. 
// За добре подбран отбор се смятал този, в който сумата на резултатите на всеки участник е кратна на 3. 
// Да се състави програма , която да приема 3-ки числа до въвеждане на 3 нули и да извежда на конзолата 
// “Yes”, ако отборът е добре подбран и “No”, ако не е.

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter 3 numbers");
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();

			if (first == 0 && second == 0 && third == 0) {
				break;
			}

			if ((first + second + third) % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
