package assignment_15_May31st;

import java.util.Scanner;

public class ECC88_ValidTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Time in 24hour formate");
		String time = scanner.next();
		System.out.println(isValidTime(time));

	}

	public static boolean isValidTime(String time) {
		boolean b = true;

		String[] arr = time.split(":");
		int hh = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		int ss = Integer.parseInt(arr[2]);

		if ((hh < 0 || hh > 24) || (mm < 0 || mm > 60) || (ss < 0 || ss > 60)) {

			b = false;
		}

		return b;

	}

}
