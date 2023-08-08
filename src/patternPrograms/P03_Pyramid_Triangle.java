package patternPrograms;

import java.util.Scanner;

public class P03_Pyramid_Triangle {

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number");
		int row = sc.nextInt();
		
		// Outer loop work for rows
		for (int i = 0; i < row; i++) {
			// inner loop work for space
			for (int j = row - i; j > 1; j--) {
				System.out.print(" ");// prints space between two stars
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");// prints star
			}
			System.out.println();// throws the cursor in a new line after printing each line
		}
	}
}