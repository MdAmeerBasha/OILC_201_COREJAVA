package assignment_18_jun4th;

import java.util.Scanner;

public class ShapeMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Choose Options which shape information you want to Enter \n 1.Circle \n 2.Square \n 3.Rectangle \n 4.Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Radius of Circle");
			Shape s1 = new Circle(scanner.nextFloat());
			s1.getArea();
			s1.getPerimeter();
			break;
		case 2:
			System.out.println("Enter the Side of the Square");
			s1 = new Square(scanner.nextFloat());
			s1.getArea();
			s1.getPerimeter();
			break;
		case 3:
			System.out.println("Enter the Length and Breadth of the Rectangle");
			s1 = new Rectangle(scanner.nextFloat(), scanner.nextFloat());
			s1.getArea();
			s1.getPerimeter();
			break;
		case 4:
			System.exit(0);
		}
		scanner.close();
	}

}
