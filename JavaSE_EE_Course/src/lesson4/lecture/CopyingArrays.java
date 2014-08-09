package lesson4.lecture;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int arrLength = sc.nextInt();
		
		 while (arrLength <= 0) {
			System.out.println("Invalid input! The length of the array must be > 0! Enter the length again!");
			arrLength = sc.nextInt();
		}
		 
		 int arr[] = new int[arrLength];
		 int arrCopy[] = new int[arrLength];
		 for (int i = 0; i < arrLength; i++) {
				System.out.println("Enter element at position " + i);
				arr[i] = sc.nextInt();
			}
		 
		 for (int i = 0; i < arrLength; i++) {
				arrCopy[i] = arr[i];
			}
		 
		 // The copy of the array: 
		 for(int element : arrCopy){
			 System.out.print(element + " ");
		 }
		 
		 System.out.println();
		 System.out.println(arrCopy);
		 System.out.println(Arrays.toString(arrCopy));
	}

}
