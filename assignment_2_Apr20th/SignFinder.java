package assignment_2_Apr20th;

public class SignFinder {
	public static void main(String[] args) {
		Sign.find(args[0]);

	}

}

class Sign {
	static void find(String str) {
		try {
			int n = Integer.parseInt(str);
			if (n == 0) {
				System.out.println("Zero");
			} else if (n > 0) {
				System.out.println("Positive Value");
			} else {
				System.out.println("Negative Value");
			}

		} catch (Exception e) {
			{
				System.out.println("Error");
			}
		}
	}

}
