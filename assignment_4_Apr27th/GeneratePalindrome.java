package assignment_4_Apr27th;

public class GeneratePalindrome {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n >= 100 && n <= 999) {
				System.out.println(getPalindromeList(n));
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	static String result = "";

	private static String getPalindromeList(int n) {

		int temp, r, rev = 0, sum;
		temp = n;
		result = result + temp;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (rev == temp)
			return result;
		result = result + "," + rev + ",";
		sum = temp + rev;
		return getPalindromeList(sum);

	}
}