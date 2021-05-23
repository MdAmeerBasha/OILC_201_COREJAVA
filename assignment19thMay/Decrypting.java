package ass19thMay;

import java.util.Scanner;

public class Decrypting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Text String");
		System.out.println("the Decrypted String is :" + getDecrypt(scanner.next()));
		scanner.close();
	}

	public static String getDecrypt(String str) {
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
