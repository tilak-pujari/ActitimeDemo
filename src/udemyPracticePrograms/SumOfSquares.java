package udemyPracticePrograms;

public class SumOfSquares {
	public static void main(String[] args) {
		SumOfSquares obj = new SumOfSquares();
		System.out.println(obj.calculateSumOfSquares(5));
	}

	public long calculateSumOfSquares(int n) {
		if (n < 0) {
			return -1;
		} else {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum = sum + (i * i);
			}

			return sum;
		}
	}
}