package mathsPrograms;

import java.util.Scanner;

public class P72_CalculateCompoundInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int principle = sc.nextInt();
		System.out.println("Enter the rate of interest");
		double rate = sc.nextDouble();
		System.out.println("Enter the time year");
		double time = sc.nextDouble();
		
		//double ci=principle*(1+(rate/100))^time-principle;
		double b=(1+(rate/100));
		double ci=principle*Math.pow(b, time);
		System.out.println(ci);
	}

}