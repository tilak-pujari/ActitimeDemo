package programs;

import java.util.Scanner;

public class P70_SwapNumWithoutUsing3rdVar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("First num: " + a);
		System.out.println("Second num: " + b);

	}

}
