package udemyPracticePrograms;

public class TriangleRightAngled {

	public static void main(String[] args) {
		TriangleRightAngled t = new TriangleRightAngled();
		System.out.println(t.isRightAngled(5, 4, 3));
	}

	public boolean isRightAngled(int side1, int side2, int side3) {

		if (side1 <= 0 && side2 <= 0 && side3 <= 0) {
			return false;
		}
		// side3=side1+side2
		else if ((((side1 * side1) == ((side2 * side2) + (side3 * side3)))
				|| ((side2 * side2) == ((side1 * side1) + (side3 * side3)))
				|| ((side3 * side3) == ((side1 * side1) + (side2 * side2)))) && (side1 > 0 && side2 > 0 && side3 > 0)) {
			return true;
		} else {
			return false;
		}
	}
}