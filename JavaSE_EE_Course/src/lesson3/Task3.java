package lesson3;

// Да се състави програма , която чете числа от клавиатурата до въвеждане на 1 и отпечатва произведението им.

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		double product = 1;
		while (true){
			double num = sc.nextDouble();
			if(num == 1){
				break;
			}
			product *=num;		
		}
		System.out.println("The product of the numbers is " + product);
	}
}
