package bridgelabz;

import java.util.Scanner;

public class Factors {
	public double factorsTheNumber(double n) {
		double fact = 1;
		for (double i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		return (fact);
	}

	public static void main(String[] args) {
		System.out.println("Enter Number To Find Prime Factor");
		Scanner sc = new Scanner(System.in);
		double userInput = sc.nextDouble();
		sc.close();
		Factors obj = new Factors();
		obj.factorsTheNumber(userInput);

	}

}
