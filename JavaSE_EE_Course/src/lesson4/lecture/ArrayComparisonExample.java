package lesson4.lecture;

import java.util.Scanner;

public class ArrayComparisonExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the first array");
		int arr1Length = sc.nextInt();
		System.out.println("Please enter the length of the second array");
		int arr2Length = sc.nextInt();
		
		 while (arr1Length <= 0 && arr2Length <= 0) {
			System.out.println("Invalid input! The lengths of the arrays must be > 0! Enter the lengths again!");
			arr1Length = sc.nextInt();
			arr2Length = sc.nextInt();
		}
		
		int[] first = new int[arr1Length];
		int[] second = new int[arr2Length];
		boolean arraysAreEqual = true;	
		
		if (arr1Length != arr1Length) {
			arraysAreEqual = false;
		}	
		else {
			for (int i = 0; i < second.length; i++) {
				System.out.println("Enter element at position " + i + " for array 1");
				first[i] = sc.nextInt();
				System.out.println("Enter element at position " + i + " for array 2");
				second[i] = sc.nextInt();
			}
			
			for (int i = 0; i < arr1Length; i++) {
				if (first[i] != second[i]) {
					arraysAreEqual = false;
				}
			}
		}
		
	System.out.println(arraysAreEqual ? "Equal!" : "Not equal!");
		
	}

}
