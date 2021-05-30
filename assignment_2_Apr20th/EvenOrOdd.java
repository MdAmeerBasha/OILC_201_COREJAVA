package assignment_2_Apr20th;

public class EvenOrOdd {
	public static void main(String[] args) {
		ED.EvenOdd(args[0]);
	}

}

class ED {
	static void EvenOdd(String str) {

		try {
			int n = Integer.parseInt(str);
			if (n % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}

		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
