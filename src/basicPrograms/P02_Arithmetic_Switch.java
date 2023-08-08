package basicPrograms;

import java.util.Scanner;

public class P02_Arithmetic_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean exit = true;
		while (exit) {
			System.out.println("Enter the choice\n1.Add\t2.Sub\t3.Multiply\t4.Divide\t5.Remainder\t6.Exit");
			int choice = sc.nextInt();

			System.out.println("Enter first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter second number:");
			int num2 = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println(num1 + num2);
			}
				break;
			case 2: {
				System.out.println(num1 - num2);
			}
				break;
			case 3: {
				System.out.println(num1 * num2);
			}
				break;
			case 4: {
				System.out.println(num1 / num2);
			}
				break;
			case 5: {
				System.out.println(num1 % num2);
			}
				break;
			case 6: {
				exit = false;
			}
				break;
			default: {
				System.out.println("Invalid Selection!");
			}
			}
		}

	}
}