package assignment19thMarch;

public class Rounder {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
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
