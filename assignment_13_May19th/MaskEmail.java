package assignment_13_May19th;

import java.util.*;

public class MaskEmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the MAIL-ID");

		System.out.println("Mask mail is: \n" + getMaskEmail(scanner.nextLine()));
		scanner.close();
	}

	static String getMaskEmail(String mail) {
		StringBuffer mask = new StringBuffer(mail);

		for (int i = 2; mask.charAt(i) != '@'; i++) {
			mask.setCharAt(i, '*');
		}

		return mask.toString();
	}

}
