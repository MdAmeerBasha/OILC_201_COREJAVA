package assignment19thMarch;

public class SumOfDigits {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int fn = n % 10;// (fn=89%10==8)
		int ln = n / 10;// (ln=89/10==9)
		int sum = fn + ln;
		System.out.println("sum of digits: " + sum);
	}

}
