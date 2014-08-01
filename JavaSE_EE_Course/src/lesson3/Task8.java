package lesson3;

// Дадени са 2 еднакви непрозрачни линийки . 
// По дължината на всяка, на равни интервали дена от друга, на еднакво разстояние от ръба са пробити дупки. 
// Дупките започват от 0-левото деление. Разстоянието м/у дупките е M милиметра за 1-та линийка и N милиметра за другата. 
// Дължината на линийките е L . М, N и L се въвеждат от клавиатурата. 
// Да се изведе колко дупки ще се съвпадат , ако линийките се поставят една в/у друга.

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M: ");
		int m = sc.nextInt();
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		System.out.println("Enter L: ");
		int l = sc.nextInt();

		int matchedHolesCounter = 0;

		if (n < m) {
			int helper = n;
			n = m;
			m = helper;
		}

		for (int i = 0; i <= l; i += n) {
			if (i % m == 0) {
				matchedHolesCounter++;
			}
		}

		System.out.println("The number of holes that match is: " + matchedHolesCounter);
	}
}
