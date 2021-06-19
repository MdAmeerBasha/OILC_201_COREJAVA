package assignment_19_june8th;

import java.util.Scanner;

public class LeaveMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many days Leaves you want");
		LeaveSystem l1 = new LeaveSystem(scanner.nextInt());
		scanner.close();

	}

}
