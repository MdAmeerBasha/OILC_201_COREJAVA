package assignment_14_May27th;

import java.util.Scanner;

public class StudentDetails {
	public int studentId;
	public String Studentname;
	private int marks;
	private char grade;
	
	StudentDetails() {
		System.out.println("Student Details");
	}

	public StudentDetails(int studentId, String studentname, int marks) {
		this.studentId = studentId;
		this.Studentname = studentname;
		this.marks = marks;

	}

	private char calculateGrade() {
		char res;
		if (marks > 90) {
			res = 'A';
		} else if (marks > 80 && marks < 90) {
			res = 'B';
		} else if (marks > 70 && marks < 80) {
			res = 'C';
		} else if (marks > 60 && marks < 70) {
			res = 'D';
		} else {
			res = 'E';
		}
		return res;

	}

	public String displayDetails() {
		grade = calculateGrade();
		return "StudentDetails [studentId=" + studentId + ", Studentname=" + Studentname + ", marks=" + marks
				+ ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int sId = scanner.nextInt();
		System.out.println("Enter Student name :");
		String sName = scanner.next();

		System.out.println("Enter Student Marks :");
		int sMarks = scanner.nextInt();

		StudentDetails sd1 = new StudentDetails(sId, sName, sMarks);
		System.out.println(sd1.displayDetails());
		scanner.close();

	}

}
