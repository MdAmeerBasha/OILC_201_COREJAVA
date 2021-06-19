package assignment_16_jun1st;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Student Inormation");
		int sId = scanner.nextInt();
		String sName = scanner.next();
		String hNo = scanner.next();
		String colonyName = scanner.next();
		String city = scanner.next();
		Address address = new Address(hNo, colonyName, city);
		Student student = new Student(sId, sName, address);
		System.out.println(student);
		scanner.close();
	}

}
