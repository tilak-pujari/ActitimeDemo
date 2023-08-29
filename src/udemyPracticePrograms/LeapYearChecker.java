package udemyPracticePrograms;

public class LeapYearChecker {

	public static void main(String[] args) {
		LeapYearChecker obj = new LeapYearChecker();
		System.out.println(obj.isLeapYear(400));
	}

	public boolean isLeapYear(int year) {
		if (year < 4) {
			return false;
		} else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			return true;
		} else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)) {
			return false;
		} else if ((year % 4 == 0) && (year % 100 == 0)) {
			return true;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
}