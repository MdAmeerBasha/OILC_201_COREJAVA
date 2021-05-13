package assignment21stMarch;

public class TwinPrimes {
	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			for (int i = n1; i <= n2; i++) {
				if (getTwinprime(i) == 0 && getTwinprime(i + 2) == 0) {
					System.out.print(i + "," + (i + 2) + ";");
				}

			}

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static int getTwinprime(int num) {
		int f = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				f = 1;
				break;
			}
		}
		return f;

	}
}
