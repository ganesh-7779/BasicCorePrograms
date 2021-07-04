package bridgelabz;

import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth value Of Harmonic Number");
		int N = sc.nextInt();
		sc.close();
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				System.out.print(1 + "/" + i + " " + "+" + " ");
			}

		} else {

			System.out.println("Invalid Input ");

		}
	}

}
