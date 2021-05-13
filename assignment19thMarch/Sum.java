package assignment19thMarch;

public class Sum {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

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
