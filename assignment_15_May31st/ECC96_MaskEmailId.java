package assignment_15_May31st;

import java.util.Scanner;

public class ECC96_MaskEmailId {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Email Id");
		String email = scanner.next();
		System.out.println(getMask(email));
		scanner.close();
	}

	static String getMask(String mail) {

		String res = "";
		int dotcount = 0;
		int atcount = 0;
		char[] ch = mail.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '@') {
				atcount++;
			}
			if (ch[i] == '.') {
				dotcount++;
			}
		}
		if ((atcount == 1) && (dotcount == 1)) {
			StringBuffer mask = new StringBuffer(mail);
			{
				for (int i = 2; mask.charAt(i) != '@'; i++) {

					mask.setCharAt(i, '*');
				}

				res = "" + mask.toString();
			}

		} else {
			res = "Invalid Email Id";
		}

		return res;

	}

}
