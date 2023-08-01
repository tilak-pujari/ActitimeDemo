package basicPrograms;
import java.util.Scanner;

public class P07_ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int digits = 0;// Get the number of digits in num
		int temp = num;
		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}
		int sum = 0;
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;

			int power = 1;// Use a loop to calculate the power of digit
			for (int i = 0; i < digits; i++) {
				power = power * digit;
			}
			sum = sum + power;
			temp = temp / 10;
		}

		if (sum == num) { // Check if the sum is equal to num and print the result
			System.out.println(num + " is an Armstrong Number.");
		} else {
			System.out.println(num + " is not Armstrong Number.");
		}
	}
}