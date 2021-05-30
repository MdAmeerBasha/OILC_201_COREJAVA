package assignment_4_Apr27th;

public class TwinPrimes {
	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			if ((n1 > 1 && n2 > 1) && (n1 < 100 && n2 < 100)) {
				for (int i = n1; i <= n2; i++) {
					if ((Twin.getTwinPrime(i) == 0) && (Twin.getTwinPrime(i + 2) == 0)) {
						System.out.print(i + "," + (i + 2) + ";");
					}
				}
			} else {
				System.out.println("Error");
			}

		} catch (Exception e)

		{
			System.out.println("Error");
		}

	}
}

class Twin {

	public static int getTwinPrime(int num) {
		int f = 0;
		for (int i = 2; i <= num /2; i++) {
			if (num % i == 0) {
				f = 1;
				break;
			}
		}

		return f;
	}
}
