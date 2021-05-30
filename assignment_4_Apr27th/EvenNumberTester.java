package assignment_4_Apr27th;

class Tester {
	public static boolean isEven(int num) {
		boolean result = false;
		for (int i = 0; i <= num; i++) {

			if (num % 2 == 0) {
				result = true;
			}
		}

		return result;

	}
}

public class EvenNumberTester {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if (num1 > 0 && num2 > 0) {
				int temp = 0;

				if (num1 > num2) {
					temp = num1;
					num1 = num2;
					num2 = temp;
				}
				for (int i = num1; i <= num2; i++) {

					if (Tester.isEven(i) == true) {
						System.out.print(i + " ");
					}
				}
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.err.println("Error");
		}
	}

}
