package lesson3;

// Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и отпечатва сумата им.

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
