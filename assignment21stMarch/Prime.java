package assignment21stMarch;

public class Prime {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if (n > 0) {
				FindPrime.isPrime(n);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class FindPrime {
	public static void isPrime(int n) {

		int nof = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				nof++;
			}
		}
		System.out.println(nof == 2);

	}
}
