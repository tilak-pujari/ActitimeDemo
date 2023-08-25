package udemyPracticePrograms;

public class TriangleValidator {

	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if ((angle1 <= 0) && (angle2 <= 0) && (angle3 <= 0)) {
			return false;
		}

		else if (((angle1 + angle2 + angle3) == 180) && ((angle1 > 0) && (angle2 > 0) && (angle3 > 0))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
	}

}
