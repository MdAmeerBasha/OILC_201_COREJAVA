package assignment_2_Apr20th;

public class RoundedSum {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			int sum = 0;
			if (a >= 0 && b >= 0 && c >= 0) {
				sum = sum + Integer.parseInt(round(a)) + Integer.parseInt(round(b)) + Integer.parseInt(round(c));
				System.out.println(sum);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static String round(int n) {
		int num = 0;
		if (n % 10 >= 5) { // (89/10=3; 8+1=9; 9*10=90)
			num = ((n / 10) + 1) * 10;
		} else {
			// (82/10=8; 8*10=80)
			num = (n / 10) * 10;
		}
		return "" + num;
	}
}
