package patternPrograms;

import java.util.Scanner;

public class P02_Left_Angle_Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number");
		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int row = sc.nextInt();
		// Outer loop work for rows
		for (int i = 0; i < row; i++) {
			// inner loop work for space
			for (int j = 2 * (row - i); j > 0; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}
}