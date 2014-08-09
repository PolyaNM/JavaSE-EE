package lesson4.lecture;

import java.util.Scanner;

/*Month with n days. Enter the average temperature for each day.
 Print: 
 - The average temperature of the month.
 - The longest sequence of days with temperature < the average of the month
 - The longest sequence of days for which the temperature of every next day is < than the temperature of the day before it.
 */
public class Task3 {
	// 10 days
	// Temperatures - 12 10 9 18 3 50 40 30 20 100
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese enter how many days are in the month: ");
		int days = sc.nextInt();

		double sum = 0;
		double[] temperatures = new double[days];
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println("Enter temperature for day " + (i + 1));
			temperatures[i] = sc.nextDouble();
			sum += temperatures[i];
		}

		double avgTemp = sum / days;

		int coldDaysCounter = 0;
		int maxColdDays = 0;
		int maxColdDaysIndex = 0;

		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] < avgTemp) {
				coldDaysCounter++;
				if (maxColdDays < coldDaysCounter) {
					maxColdDays = coldDaysCounter;
					maxColdDaysIndex = i;
				}
			} else {
				coldDaysCounter = 0;
			}
		}

		int colderDaysCounter = 0;
		int maxColderDays = 0;
		int maxColderDaysIndex = 0;

		for (int i = 0; i < temperatures.length - 1; i++) {
			if (temperatures[i] > temperatures[i + 1]) {
				colderDaysCounter++;
				if (maxColderDays < colderDaysCounter) {
					maxColderDays = colderDaysCounter;
					maxColderDaysIndex = i + 1;
				}
			} else {
				colderDaysCounter = 0;
			}
		}

		System.out.println(avgTemp);
		System.out.println("Max sequence of cold days under " + avgTemp
				+ " degrees");
		for (int i = maxColdDaysIndex - maxColdDays + 1; i <= maxColdDaysIndex; i++) {
			System.out.print(temperatures[i] + " ");
		}
		System.out.println();
		System.out
				.println("Max sequence of colder days (decreasing temperature with every single day)");
		for (int i = maxColderDaysIndex - maxColderDays + 1; i <= maxColderDaysIndex; i++) {
			System.out.print(temperatures[i] + " ");
		}
	}

}
