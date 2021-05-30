package assignment_7_May4th;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String menu = "Menu Driven Application\n";
			menu += "1.Addition\n";
			menu += "2.Subtraction\n";
			menu += "3.Multiplication\n";
			menu += "4.Division\n";
			menu += "5.Exit\n";
			menu += "Select Any option\n";
			System.out.println(menu);
			int choice = scanner.nextInt();
			
			String res = " ";

			switch (choice) {

			case 1:
				System.out.println("enter the Two Numbers");
				res = "sum of two numbers is " + (scanner.nextInt() + scanner.nextInt());
				break;
			case 2:
				System.out.println("enter the Two Numbers");
				res = "Subtraction of two numbers is " + (scanner.nextInt() - scanner.nextInt());
				break;
			case 3:
				System.out.println("enter the Two Numbers");
				res = "Multiplication  of two numbers is " + (scanner.nextInt() * scanner.nextInt());
				break;
			case 4:
				System.out.println("enter the Two Numbers");
				res = "Division  of two numbers is " + (scanner.nextInt() / scanner.nextInt());
				break;
			case 5:
				System.exit(0);
				break;
			default:
				res = "Invalid Option";

			}
			System.out.println(res);
			scanner.close();
		}
		
	}

}
