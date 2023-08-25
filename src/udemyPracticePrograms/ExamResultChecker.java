package udemyPracticePrograms;

public class ExamResultChecker {
	public boolean isPass(int marks) {

		// If the student's marks are greater than 50,they have passed the exam.
		if (marks == 50) {
			return false;
		} else if (marks > 50) {
			return true;
		} else
			return false;
	}

}
/*
  
 * student is considered to have passed the exam if they have scored more than
 * 50 marks. If the student's marks are 50 or less, they are considered to have
 * failed.
 
 */