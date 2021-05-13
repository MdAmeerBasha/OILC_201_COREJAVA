package assignment20thMarch;

public class ThreeDPalindrome {
	public static void main(String[] args) {
		boolean res = ThreeDPalindrome.palin(args[0]);
		System.out.println(res);

	}

	static boolean palin(String s) {
		int n = s.length();
		String z = "";
		z = z + s.charAt(n - 1) + s.charAt(n - 2) + s.charAt(n - 3);
		return s.equals(z);
	}

}
