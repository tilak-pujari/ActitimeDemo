package basicPrograms;

import java.util.Scanner;

public class P24_Check_Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next().toLowerCase();
		String reverse="";
		
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome!");
		}
	}

}
