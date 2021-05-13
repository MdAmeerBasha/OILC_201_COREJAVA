package assignment29thMarch;

public class BiggestAmongFive {
	public static void main(String[] args) {
		if (args.length != 5) {
			System.out.println("Please Enter five Arguments only");
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
			num2 = Integer.parseInt(args[3]);
			if (num1 < num2) {
				num1 = num2;
			}
			num2 = Integer.parseInt(args[4]);
			if (num1 < num2) {
				num1 = num2;
			}
			System.out.println(num1 + " is Biggest Number than other Numbers");

		} catch (Exception e) {
			System.out.println("Please Enter the Integer Values Only");
		}

	}

}
