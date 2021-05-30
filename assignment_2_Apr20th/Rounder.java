package assignment_2_Apr20th;

public class Rounder {
	public static void main(String[] args) {
		Round.check(args[0]);

	}

}

class Round {
	static void check(String str) {
		try {
			int n = Integer.parseInt(str);
			if (n % 2 == 0) {
				int a = n / 10;
				int even = (a + 1) * 10;
				System.out.println(even);
			} else {
				System.out.println(n);
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
