package lesson4.lecture;

import java.util.Arrays;
import java.util.Scanner;
 
// Array of 10 workers(names). Print the elements of the array. Print them in reverse order.s
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int workersCount = 10;
		String[] workersList = new String[workersCount];

		for (int i = 0; i < workersCount; i++) {
			workersList[i] = sc.next();
		}
		
		System.out.println("The names of the workers are: ");
		System.out.println(Arrays.toString(workersList));
		System.out.println("The names of the workers in reverse order are: ");
		
		for (int i = workersCount - 1; i >= 0; i--) {
			System.out.print(workersList[i] + " ");
		}
	}

}
