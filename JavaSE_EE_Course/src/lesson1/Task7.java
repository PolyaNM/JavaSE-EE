package lesson1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you have?");	
		double money = sc.nextDouble();
		System.out.println("Are you healthy? true/false");
		boolean isHealthy = sc.nextBoolean();
		
		if (isHealthy) {
			if (money > 0 && money < 10) {
				System.out.println("I'll go out with my friends to drink coffee!");
			}
			else {
				System.out.println("I won't go out with my friends to drink coffee!");
			}
		}
		else {
			if (money > 0) {
				System.out.println("I'll go by some medicine!");
			}
			else {
				System.out.println("I'll stay at home and drink tea!");
			}
		}
	}
	
}
