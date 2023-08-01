package basicPrograms;

public class P01_Arithmetic_Operations {

	public static int add(int num1, int num2) {
		return (num1 + num2);
	}

	public static int sub(int num1, int num2) {
		return (num1 - num2);
	}

	public static int mul(int num1, int num2) {
		return (num1 * num2);
	}

	public static int div(int num1, int num2) {
		return (num1 / num2);
	}

	public static int mod(int num1, int num2) {
		return (num1 % num2);
	}

	public static void main(String[] args) {

		// Basic Arithmetic Operations in Java include
		// Addition (+) ---> gives sum of two numbers
		// Subtraction (-) ---> gives subtracted value between two numbers
		// Multiplication (*) ---> gives multiplied value between two numbers
		// Divison (/) ---> gives divided value between two numbers
		// Modulus (%) ---> gives remainder after divison

		System.out.println(add(10, 50));// output=60

		System.out.println(sub(20, 5));// output=15

		System.out.println(mul(10, 5));// output=50

		System.out.println(div(50, 10));// output=5

		System.out.println(mod(15, 2));// output=1
	}
}
