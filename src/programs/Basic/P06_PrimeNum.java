package programs.Basic;

import java.util.Scanner;

public class P06_PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();
		
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i+" ");
			}
		}
	}

}
//Prime Number-number which is divisible by itself