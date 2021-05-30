package assignment_3_Apr24th;

public class OddPalindrome {
	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			if (n1 > n2) {
				System.out.println("Error");
			} else if ((n1 > 100 && n2 > 100) && (n1 < 999 && n2 < 999)) {
				for (int i = n1; i <= n2; i++) {

					System.out.print(Palin.getOddPalindrome(i));
				}
			}

			else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}

class Palin {
	public static String getOddPalindrome(int num) {

		String s = "";

		int temp = num;
		int rem = 0;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}
		if (temp == rev) {
			s = s + rev + ",";

		}
		return s;

	}
}
