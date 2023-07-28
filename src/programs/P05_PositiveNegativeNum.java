package programs;

import java.util.Scanner;

public class P05_PositiveNegativeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("Typed number is Zero!");
		} else if (num > 0) {
			System.out.println("Number is Positive!");
		} else {
			System.out.println("Number in Negative!");
		}
	}

}
