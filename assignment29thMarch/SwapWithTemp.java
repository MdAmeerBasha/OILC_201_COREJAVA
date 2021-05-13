package assignment29thMarch;

public class SwapWithTemp {
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int temp = 0;

			System.out.println("Numbers before Swaping : " + num1 + " " + num2);

			temp = num1;
			num1 = num2;
			num2 = temp;

			System.out.println("Numbers After Swaping : " + num1 + " " + num2);
		} catch (Exception e) {
			System.out.println("Please enter the number only");
		}

	}

}
