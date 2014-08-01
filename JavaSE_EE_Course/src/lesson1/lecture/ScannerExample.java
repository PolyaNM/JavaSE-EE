package lesson1.lecture;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please add a number:");
		short firstNumber = sc.nextShort();
		long firstNumberL = sc.nextLong();
		
		float firstReal = sc.nextFloat();
		double secondReal = sc.nextDouble();
		
		System.out.println("The biggest of the two digits is: " + ((firstNumber > firstNumberL) ? firstNumber : firstNumberL) );
		System.out.println("Are equal? - " + (firstReal == secondReal));

	}

}
