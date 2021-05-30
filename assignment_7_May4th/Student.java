package assignment_7_May4th;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {

		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Marks");
		int A1 = scanner.nextInt();
		int A2 = scanner.nextInt();
		int A3 = scanner.nextInt();
		int A4 = scanner.nextInt();
		int A5 = scanner.nextInt();
		int A6 = scanner.nextInt();

		if (A1 > 34 && A2 > 34 && A3 > 34 && A4 > 34 && A5 > 34 && A6 > 34) {
			System.out.println("You Passed all the Subject");
			int total = A1 + A2 + A3 + A4 + A5 + A6;
			res += "total is " + total+"\n";
			int avg = total / 6;
			res += "average is " + avg+"\n";
			if (avg >= 70) {
				res += "Passed with Distinction\n ";
			} else if (avg >= 60) {
				res += "Passed with First Class\n ";
			} else if (avg >= 50) {
				res += "Passed with Second Class\n ";
			} else {
				res += "Passed with Third class\n ";
			}

		}

		else {
			res +="failed";
		}
		System.out.println(res);
	}

}
