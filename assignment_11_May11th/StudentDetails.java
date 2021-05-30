package assignment_11_May11th;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[5];

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter The Student  Subject " + (i + 1) + " marks");
			marks[i] = scanner.nextInt();
		}
		DisplayMarks(marks);
		System.out.println(getResult(marks));
		scanner.close();
	}

	public static void DisplayMarks(int[] marks) {
		System.out.println("The marks are");

		for (int m : marks) {
			System.out.println(m);
		}

	}

	public static int getTotal(int[] marks) {
		int sum = 0;

		for (int m : marks) {
			sum = sum + m;
		}

		return sum;

	}

	public static int getAvg(int[] marks) {
		return getTotal(marks) / 5;

	}

	public static String getGrade(int[] marks) {
		String grade = "";
		int avg = getAvg(marks);
		if (avg >= 70) {
			grade += "A grade";
		} else if (avg > 60 && avg < 70) {
			grade += "B grade";
		} else {
			grade += "C grade";
		}
		return grade;
	}

	public static boolean getPass(int[] marks) {
		boolean b = false;
		String str = "";
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 35) {
				str += "true";
			}
		}
		if (str.equalsIgnoreCase("truetruetruetruetrue")) {
			b = true;
		}
		return b;

	}

	public static String getResult(int[] marks) {
		String result = "";
		if (getPass(marks)) {
			result += "Total Marks " + getTotal(marks) + "\n";
			result += "Avg Marks " + getAvg(marks) + "\n";
			result += "Grade is :" + getGrade(marks);
		} else {
			result += "Failed";
		}
		return result;

	}

}
