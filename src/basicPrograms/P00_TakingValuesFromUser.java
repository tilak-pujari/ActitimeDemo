package basicPrograms;

import java.util.Scanner;

public class P00_TakingValuesFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first nmuber:");
		int num1 = sc.nextInt();

		System.out.println("Enter the second nmuber:");
		int num2 = sc.nextInt();

		System.out.println("Sum between number " + num1 + " and " + num2 + " is " + (num1 + num2));
	}

}
