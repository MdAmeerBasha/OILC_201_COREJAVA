package assignment_2_Apr20th;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String s = sum(num);
		System.out.println(s);
	}

	static String sum(int num) {
		int a = num % 10;
		int b = num / 10;
		return " " + (a + b);
	}

}
