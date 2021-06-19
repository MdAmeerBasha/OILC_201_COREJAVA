package assignment_16_jun1st;

import java.util.Scanner;

public class Student1MarksMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Student number, name, 3 subject marks");
		Marks marks = new Marks(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt());
		marks.dispStudent();
		scanner.close();
	}

}
