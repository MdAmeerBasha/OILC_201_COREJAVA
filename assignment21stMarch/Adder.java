package assignment21stMarch;

class AddFinder {
	public static int add(int num1, int num2) {

		int sum = num1 + num2;

		return sum;

	}
}

public class Adder {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			if (num1 > 0 && num2 > 0) {
				System.out.println(AddFinder.add(num1, num2));
			} else
				System.out.println("Error");
		} catch (Exception e) {
			System.err.println("Error");
		}

	}

}