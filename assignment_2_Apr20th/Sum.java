package assignment_2_Apr20th;

public class Sum {
	public static void main(String[] args) {
		Run.walk(args[0], args[1], args[2]);

	}
}

class Run {
	static void walk(String str1, String str2, String str3) {
		try {
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			int c = Integer.parseInt(str3);

			if (a > 0 && b > 0 && c > 0) {

				int r1 = ((a / 10) + 1) * 10;
				int r2 = ((b / 10) + 1) * 10;
				int r3 = ((c / 10) + 1) * 10;

				int result = r1 + r2 + r3;
				System.out.println("sum of these rounded values : " + result);
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
