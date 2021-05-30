package assignment_1_Apr19th;

public class ThreeDPalindrome {
	public static void main(String[] args) {
		String s = args[0];
		int n = s.length();
		String z = "";
		z = z + s.charAt(n - 1) + s.charAt(n - 2) + s.charAt(n - 3);
		System.out.println(s.equals(z));

	}

}
