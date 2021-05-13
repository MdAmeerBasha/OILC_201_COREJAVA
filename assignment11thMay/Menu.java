package assignment11thMay;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x[][] = new int[2][2];
		int y[][] = new int[2][2];
		System.out.println("Enter the elements in Array x");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the Elements in Array Y");
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = scanner.nextInt();
			}
		}

		while (true) {
			System.out.println(menu());
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				int sum[][] = sum(x, y);
				System.out.println(disp(sum));
				break;
			case 2:
				int sub[][] = sub(x, y);
				System.out.println(disp(sub));
				break;
			case 3:
				int mul[][] = mul(x, y);
				System.out.println(disp(mul));
				break;
			case 4:
				System.exit(0);
			}
			scanner.close();

		}

	}

	public static String menu() {
		String menu = "Menu Driven Application\n";
		menu += "1.Addition\n";
		menu += "2.Subtraction\n";
		menu += "3.Multiplication\n";
		menu += "4.Exit\n";
		menu += "Choose any option";
		return menu;

	}

	public static int[][] sum(int[][] x, int[][] y) {
		int res[][] = new int[2][2];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				res[i][j] = x[i][j] + y[i][j];
			}
		}
		return res;
	}

	public static int[][] sub(int[][] x, int[][] y) {
		int res[][] = new int[2][2];
		{
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					res[i][j] = x[i][j] - y[i][j];
				}
			}
		}
		return res;
	}

	public static int[][] mul(int[][] x, int[][] y) {
		int res[][] = new int[2][2];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				res[i][j] = res[i][j] + x[i][j] * y[i][j];
			}
		}
		return res;
	}

	private static String disp(int[][] res) {
		String res1 = "";
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res1 += " " + res[i][j];
			}
			res1 += "\n";
		}
		return res1;
	}
}
