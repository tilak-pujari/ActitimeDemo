package basicPrograms;

import java.util.Random;

public class P12_Generate_Random_Number {

	public static void main(String[] args) {
		int min = 200;
		int max = 400;
		// Generate random double value from 200 to 400
		System.out.println("Random value of type double between " + min + " to " + max + ":");
		double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);

		Random r = new Random();
		int num = r.nextInt(0, 100);
		System.out.println(num);

		float num2 = r.nextFloat(0, 10);
		System.out.println(num2);

	}

}
