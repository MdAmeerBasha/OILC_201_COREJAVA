package assignment_4_Apr27th;

public class Palindrome {
	public static void main(String[] args) {

		try {
			int n = Integer.parseInt(args[0]);
			PD.isPalindrome(n);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class PD {
	public static void isPalindrome(int n) {

		if (n > 0) {
			int temp = n;
			int rem = 0;
			int rev = 0;
			while (n != 0) {
				rem = n % 10;
				n = n / 10;
				rev = rev * 10 + rem;
			}
			if (temp == rev) {
				System.out.println("True");
			} else {
				System.out.println("False");

			}
		} else {
			System.out.println("Error");
		}

	}

}
