package lesson3;

// There are 2 similar transparent rulers. Length of the rulers - L.
// Each of them has holes. The holes are placed in intervals of M mm for the first ruler and N mm for the second one.
// The holes start from 0 mm for both rulers.
// Print how many holes will match if the first ruler is placed over the second one.

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
