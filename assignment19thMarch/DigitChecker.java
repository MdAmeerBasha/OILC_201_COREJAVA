package assignment19thMarch;

public class DigitChecker {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int fn = n / 10;
		int ln = n % 10;
		int checker = fn - ln;
		System.out.println(checker);
	}

}
