package assignment_6_Apr29th;

public class BiggestOfThree {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Please enter only Three numbers");
			return;
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			if (num1 < num2) {
				num1 = num2;
			}

			num2 = Integer.parseInt(args[2]);

			if (num1 < num2) {
				num1 = num2;

			}
			System.out.println(num1 + " is Biggest Number than other Numbers ");

		} catch (Exception e) {
			System.out.println("Please Enter the Number only");
		}
	}

}
