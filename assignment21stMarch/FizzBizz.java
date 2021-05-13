package assignment21stMarch;

class FizzBizzChecker {
	public static String getOutputString(int num) {
		String result = null;
		if (num % 3 == 0 && num % 5 == 0) {
			result = "FizzBizz";
		} else if (num % 3 == 0) {
			result = "Fizz";
		} else if (num % 5 == 0) {
			result = "Bizz";

		} else {
			result = "" + num;
		}
		return result;

	}
}

public class FizzBizz {

	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				System.out.println(FizzBizzChecker.getOutputString(num));

			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.err.println("Error");
		}

	}

}