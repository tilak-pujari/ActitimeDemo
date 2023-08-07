package numbersPrograms;

import java.util.Scanner;

public class P04_EvenOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is even or odd");
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("The Number you have typed is Zero!");
		} else if (num % 2 == 0) {
			System.out.println("Number is Even!");
		} else {
			System.out.println("Number is Odd!");
		}
	}

}
