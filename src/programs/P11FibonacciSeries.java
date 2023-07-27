package programs;

import java.util.Scanner;

public class P11FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value until you want to calculate?");
		int upto = sc.nextInt();

		int first = 0;
		int next = 0;
		int second = 1;
		for (int i = 1; i <= upto; i++) {
			System.out.print(first + " ");
			next = first + second;
			first = second;
			second = next;

		}
	}

}
