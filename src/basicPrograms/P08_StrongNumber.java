package basicPrograms;

import java.util.Scanner;

public class P08_StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10; // get last digit
			int fact = 1;
			
			for (int i = 1; i <= rem; i++) {
				fact *= i; // Calculate factorial
			}
			sum = sum + fact; // add factorial to sum
			temp = temp / 10; // remove last digit

		}
		if (num == sum) {
			System.out.println(num + " is Strong Number");
		} else {
			System.out.println(num + " is Not Strong Number");
		}
	}

}
