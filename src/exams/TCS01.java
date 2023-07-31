package exams;

import java.util.Scanner;

public class TCS01 {

	public int method(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = (i * i)  + sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		TCS01 obj = new TCS01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start of range");
		int start = sc.nextInt();
		System.out.println("Enter the end of the range");
		int end = sc.nextInt();
		

		int result = obj.method(start, end);
		System.out.println(result);

	}

}
