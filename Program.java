package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("how many people will be typed? ");
		int n = sc.nextInt();

		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Enter with data of " + (i + 1) + "a Person: ");
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
		}
		double sun = 0.0;
		// vector for acumulate values of Average Height
		for (int i = 0; i < n; i++) {
			sun += height[i];
		}

		System.out.println();
		double averageHeight = sun / n;
		System.out.printf("Average Height is: %.2f", averageHeight);

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] < 16)
				         count++;
		}

		double percent = count*100.0/n;
		System.out.printf("People under 16 years old: %.0f%%",percent);


		sc.close();
	}

}
