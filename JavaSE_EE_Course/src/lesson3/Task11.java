package lesson3;

// Да се състави програма, която чете от клавиатурата число К и след това поредица от числа, докато сбора им не стане по-голям или равен на K , 
// след което извежда на конзолата броя на въведените след K числа и средно аритметичното на сумата им.

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
