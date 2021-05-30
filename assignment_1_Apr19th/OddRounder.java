package assignment_1_Apr19th;

public class OddRounder {
	public static void main(String[] args) {
		try {

			int n = Integer.parseInt(args[0]);
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
