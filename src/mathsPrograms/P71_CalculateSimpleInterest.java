package mathsPrograms;

import java.util.Scanner;

public class P71_CalculateSimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p = sc.nextInt();
		System.out.println("Enter the rate of interest");
		double r = sc.nextDouble();
		System.out.println("Enter the time year");
		double t = sc.nextDouble();

		double si = p+(p * r * t) / 100;
		System.out.println(si);
	}

}
