package basicPrograms;

import java.util.Scanner;

public class P09_Buzz_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();
		for (int i = 1; i <= range; i++) {
			int temp = i;

			if (temp % 7 == 0 || temp % 10 == 7) {
				System.out.print(temp + " ");
			}
		}
	}
}


//7 14 17 21 27 28 35 37 42 47 49 
//Number divisible by 7 or ending with 7