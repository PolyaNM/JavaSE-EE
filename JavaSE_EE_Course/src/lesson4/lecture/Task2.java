package lesson4.lecture;

import java.util.Scanner;

/* Two arrays with length = 10; First array - workers' names. 
Second array - their corresponding wages. 
Print: 
 - The name and salary of the worker with the biggest salary
 - The name and salary of the worker with the smallest salary
 - The sum of all salaries
 - The average of all salaries
 */

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		double[] salaries = new double[10];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter data for worker number " + (i+1));
			System.out.println("Name: ");
			names[i] = sc.next();
			System.out.println("Salary: ");
			salaries[i] = sc.nextDouble();
		}
		
		int maxSalaryIndex = 0;
		int minSalaryIndex = 0;
		double sumOfAllSalary = 0;
		double avarageOfSalaries = 0;
		
		for (int i = 0; i < names.length; i++) {
			if (salaries[maxSalaryIndex] < salaries[i]) {
				maxSalaryIndex = i;
			}
			if (salaries[minSalaryIndex] > salaries[i]) {
				minSalaryIndex = i;
			}
			
			sumOfAllSalary += salaries[i];
		}
		avarageOfSalaries = sumOfAllSalary / salaries.length;
		
		System.out.println("The worker with biggest salary is " + names[maxSalaryIndex] + " and salary = " + salaries[maxSalaryIndex]);
		System.out.println("The worker with smallest salary is " + names[minSalaryIndex] + " and salary = " + salaries[minSalaryIndex]);
		System.out.println("The sum of all salaries is " + sumOfAllSalary);
		System.out.println("The avarage of all salaries is " + avarageOfSalaries);
	}

}
