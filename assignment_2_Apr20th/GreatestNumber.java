package assignment_2_Apr20th;

class Great {
	void check(String str1, String str2) {
		try {
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			if (a > b) {
				System.out.println("greatest number is " + a);
			} else {
				System.out.println("greatest number is " + b);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}

public class GreatestNumber {
	public static void main(String[] args) {
		Great great = new Great();
		great.check(args[0], args[1]);

	}

}
