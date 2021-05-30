package assignment_4_Apr27th;

class Scores {

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

public class CricketScores {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			float n2 = Float.parseFloat(args[1]);

			System.out.println(Scores.getDisplayDetailes(n1, n2));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
