package programs;

import java.util.Scanner;

public class P08_StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact*=j;
			}
			sum+=fact;
			
		}
		System.out.println("Prime of Num "+num+"is "+sum);
	}

}
