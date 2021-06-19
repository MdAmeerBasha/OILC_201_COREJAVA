package assignment_18_jun4th;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Choose Options which Student information you want to Enter : \n 1.Science Student \n 2.History Student \n 3.Exit");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Student Name, class and Three subject marks for Science Student");
			Student s1 = new ScienceStudent(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt());
			System.out.println(s1);
			break;
		case 2:
			System.out.println("Enter Student Name, class and Two subject marks for History Student");
			s1 = new HistoryStudent(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
			System.out.println(s1);
			break;
		case 3:
			System.exit(0);
		}
		scanner.close();

	}

}
