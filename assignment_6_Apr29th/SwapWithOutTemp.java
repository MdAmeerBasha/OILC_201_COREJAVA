package assignment_6_Apr29th;

public class SwapWithOutTemp {
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			System.out.println("Numbers before Swaping : " + num1 + " " + num2);

			num1 = num1 + num2; // 30=10+20
			num2 = num1 - num2; // 10=30-20
			num1 = num1 - num2; // 20=30-10

			System.out.println("Numbers After Swaping : " + num1 + " " + num2);
		} catch (Exception e) {
			System.out.println("Please Enter the numbers only");
		}

	}

}
