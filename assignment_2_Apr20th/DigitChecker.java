package assignment_2_Apr20th;

public class DigitChecker {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String s = digit(num);
		System.out.println(s);
	}

	static String digit(int num) {
		int a = num % 10;
		int b = num / 10;
		return " " + (Math.abs(a - b));
	}

}
