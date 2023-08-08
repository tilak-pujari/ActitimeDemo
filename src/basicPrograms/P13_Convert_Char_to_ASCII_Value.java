package basicPrograms;

public class P13_Convert_Char_to_ASCII_Value {

	public static void main(String[] args) {

		// character whose ASCII value to be found
		char ch1 = 'a';
		// variable that stores the integer value of the character
		int value1 = ch1;
		System.out.println("The ASCII value of " + ch1 + " is: " + value1);
		
		char ch2 = '9';
		int value2 = ch2;
		System.out.println("The ASCII value of " + ch2 + " is: " + value2);
	
	
		char ch3 = 'A';
		int value3 = ch3;
		System.out.println("The ASCII value of " + ch3 + " is: " + value3);
		
		// convert ASCII value to character found
		char ch4=(char)value3;
		System.out.println("The Character for ASCII value " + value3 + " is: " + ch4);
	}

}
