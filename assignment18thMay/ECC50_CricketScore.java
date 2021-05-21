package ass18thMay;

import java.util.Scanner;

public class ECC50_CricketScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Runs");
		int n1 = scanner.nextInt();
		System.out.println("Enter the Overs");
		float n2 = scanner.nextFloat();

		System.out.println(getDisplayDetailes(n1, n2));
		scanner.close();

	}

	public static String getDisplayDetailes(int runs, float overs) {
		String x = "";
		int count, q, r;
		count = (int) (overs * 10);
		q = count / 10;
		r = count % 10;
		float balls = (q * 6) + r;
		if ((balls < 100) || (runs < 100)) {
			x = x + runs + " runs in " + (int) balls + " balls " + " @ " + String.format("%.2f", (runs / balls))
					+ " runs per ball";
		} else {
			x = x + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs))
					+ " runs per over";
		}
		return x;
	}
}
