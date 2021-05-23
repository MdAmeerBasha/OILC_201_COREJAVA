package ass19thMay;

import java.util.*;

public class EncryptedString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		System.out.println("Encrypted String is: " + getEncryption(scanner.nextLine()));
		scanner.close();
	}

	static String getEncryption(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			int x = (int) str.charAt(i);
			x = x - 97;
			x = 122 - x;
			res += (char) x;

		}
		return res;
	}

}
