package assignment_1_Apr19th;

public class SignFinder {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
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
