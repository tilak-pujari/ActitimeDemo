package udemyPracticePrograms;

public class PerformArithmetic {
	public int perform(int a, int b) {
		return 1;
	}

	public static void main(String[] args) {
		Add a = new Add();
		System.out.println(a.perform(10, 5));

		Sub s = new Sub();
		System.out.println(s.perform(10, 5));

		Multiply m = new Multiply();
		System.out.println(m.perform(10, 5));

		Divide d = new Divide();
		System.out.println(d.perform(10, 5));
		System.out.println(d.perform(10, 0)); // check if y is zero it should get -1
	}
}

class Add extends PerformArithmetic {
	@Override
	public int perform(int a, int b) {
		return a + b;
	}
}

class Sub extends PerformArithmetic {
	@Override
	public int perform(int a, int b) {
		return a - b;
	}
}

class Multiply extends PerformArithmetic {
	@Override
	public int perform(int a, int b) {
		return a * b;
	}
}

class Divide extends PerformArithmetic {
	@Override
	public int perform(int a, int b) {
		if (b == 0) {
			return -1;
		}
		return a / b;
	}
}