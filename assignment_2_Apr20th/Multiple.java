package assignment_2_Apr20th;

public class Multiple {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String res = check(num);
		System.out.println(res);

	}

	private static String check(int num) {
		int a = num / 100;
		int b = (a + 1) * 100;
		return " " + (b);

	}

}
