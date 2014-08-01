package lesson1;

public class Task7 {

	public static void main(String[] args) {
		int hour; // never used ?
		double money = 30.50;
		boolean isHealthy = false;
		
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
