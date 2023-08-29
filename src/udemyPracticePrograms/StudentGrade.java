package udemyPracticePrograms;

public class StudentGrade {

	private int marks;

	public StudentGrade(int marks) {
		this.marks = marks;
	}

	public char assignGrade() {
		// method which assigns the grade based on marks.
		// If marks are less than 0 or greater than 100, return 'X'
		if (marks > 100 || marks < 0) {
			return 'X';
		}
		// If marks are greater than or equal to 90, return 'A'
		else if (marks >= 90) {
			return 'A';
		}
		// If marks are greater than or equal to 80, return 'B'
		else if (marks >= 80) {
			return 'B';
		}
		// If marks are greater than or equal to 70, return 'C'
		else if (marks >= 70) {
			return 'C';
		}
		// If marks are greater than or equal to 60, return 'D'
		else if (marks >= 60) {
			return 'D';
		}
		// If marks are greater than or equal to 50, return 'E'
		else if (marks >= 50) {
			return 'E';
		}
		// If marks are less than 50, return 'F'
		else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentGrade obj = new StudentGrade(55);
		System.out.println(obj.assignGrade());
	}
}