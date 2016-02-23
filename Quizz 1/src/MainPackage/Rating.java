package MainPackage;

import java.util.Scanner;

public class Rating {
	public static void InputRate() {
		System.out.println("Number of Touchdowns: ");
		Scanner a = new Scanner(System.in);
		int td = a.nextInt();

		System.out.println("Total Yards: ");
		Scanner b = new Scanner(System.in);
		int ty = b.nextInt();

		System.out.println("Interceptions: ");
		Scanner c = new Scanner(System.in);
		int it = c.nextInt();

		System.out.println("Number of Completions: ");
		Scanner d = new Scanner(System.in);
		int comp = d.nextInt();

		System.out.println("Number of Attempts: ");
		Scanner e = new Scanner(System.in);
		int at = e.nextInt();

		double aa = ((comp / at) - .3) * 5;
		double bb = ((ty / at) - 3) * .25;
		double cc = (td / at) * 20;
		double dd = 2.375 - ((it / at) * 25);

		double PasserRating = ((aa + bb + cc + dd) / 6) * 100;
		System.out.println("The Passer rating is " + PasserRating);

	}

}