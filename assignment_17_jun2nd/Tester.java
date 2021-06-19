package assignment_17_jun2nd;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name,Id Salary");
		String name = scanner.next();
		int id = scanner.nextInt();
		double salary = scanner.nextDouble();
		Employees e1 = new Employees(name, id, salary);
		System.out.println(" Select Any option from below\n 1.Manger \n 2.Clerk \n 3.Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Manager m1 = new Manager(name, id, salary, ManagerType.SALES);
			System.out.println(m1);
			break;
		case 2:
			System.out.println("Enter the Speed and Accuracy");
			int speed = scanner.nextInt();
			int accuracy = scanner.nextInt();
			Clerk c1 = new Clerk(name, id, salary, speed, accuracy);
			System.out.println(c1);
			break;
		case 3:
			System.exit(0);
		}
		scanner.close();

	}

}
