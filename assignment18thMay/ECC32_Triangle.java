package ass18thMay;

import java.util.Scanner;

public class ECC32_Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sides of the triangle");
		System.out.println(getTriangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getTriangle(int num1, int num2, int num3) {
		String res = "";
		if (num1 == 0 || num2 == 0 || num3 == 0) {
			res += -1;
		} else if (num1 < 0 || num2 < 0 || num3 < 0) {
			res += -2;
		} else if ((num1 + num2) < num3 || (num2 + num3) < num1 || (num3 + num1) < num2) {
			res += -3;
		} else {
			if (num1 == num2 && num2 == num3) {
				res = "EQUILATERAL Triangle";

			} else if (num1 == num2 && num2 != num3) {
				res = "ISOSCELES Triangle ";

			} else if (num1 != num2 && num2 != num3 && num3 != num1) {
				res = "SCALENE Triangle";

			}
		}
		return res;
	}

}
