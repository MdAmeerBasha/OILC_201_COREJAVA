package assignment_19_june8th;

import java.util.Scanner;

class ProperAgeException extends Exception {
	public ProperAgeException(String mess) {
		super(mess);
	}
}

public class AgeExceptionProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Age :");
		int age = scanner.nextInt();
		try {
			if (age < 0) {
				throw new ProperAgeException("Please Enter proper age");
			} else {
				System.out.println("age is valid");
			}
		} catch (ProperAgeException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
