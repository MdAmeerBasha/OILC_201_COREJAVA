package assignment29thMarch;

public class BiggestOfTwo {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Please enter only two Arguments");
			return;
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num = 0;
			if (num1 > num2) {
				num = num1;
			} else if (num2 > num1) {
				num = num2;
			} else {
				System.out.println("both number are equal");
				return;
			}
			System.out.println(num + " is Biggest Number Among " + num1 + " and " + num2);
		} catch (Exception e) {
			System.out.println("please Enter Number only");
		}
	}
}
