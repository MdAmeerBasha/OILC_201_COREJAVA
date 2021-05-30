package assignment_2_Apr20th;

class least {
	void check(String str1, String str2) {
		try {
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			if (a < b) {
				System.out.println("least number is " + a);
			} else {
				System.out.println("least number is " + b);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}

public class LeastNumber {
	public static void main(String[] args) {
		least least = new least();
		least.check(args[0], args[1]);

	}

}
