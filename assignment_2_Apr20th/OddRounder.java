package assignment_2_Apr20th;

public class OddRounder {
	public static void main(String[] args) {
		Rounder1.Round1(args[0]);

	}
}

class Rounder1 {
	static void Round1(String str) {
		try {

			int n = Integer.parseInt(str);
			if (n % 2 == 0) {
				System.out.println("Even Number");
			} else if (n < 0) {
				System.out.println("Error");
			} else {
				int a = n / 10;
				int odd = (a + 1) * 10;
				System.out.println(odd);

			}

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
