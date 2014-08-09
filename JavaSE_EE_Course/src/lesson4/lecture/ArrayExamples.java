package lesson4.lecture;

import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int arrLength;
		do {
			arrLength = sc.nextInt();
			System.out.println("Invalid input! N must be > 0!");
		} while (arrLength <= 0);
		
		int[] arr = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			System.out.println("Enter element at position " + i);
			arr[i] = sc.nextInt();
		}
		
		for(int ar : arr){
			System.out.print(ar + " ");
		}
		
	}

}
 