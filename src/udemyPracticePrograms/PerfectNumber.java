package udemyPracticePrograms;

public class PerfectNumber {

	public static void main(String[] args) {
		PerfectNumber obj = new PerfectNumber();
		System.out.println(obj.isPerfectNumber(496));
	}

	public boolean isPerfectNumber(int number) {
		int i = 1;
		int sum = 0;
		while (i <= number / 2) {
			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (number == 0) {
			return false;
		} else if (sum == number) {
			return true;
		} else {
			return false;
		}
	}
}

//perfect number is a positive integer whose sum of its proper divisors is equal to 1.
//6 28,496,8128