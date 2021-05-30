package assignment_2_Apr20th;

class Even {
	void finder(String str) {

		try {
			int n = Integer.parseInt(str);
			System.out.println(n % 2 == 0);
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}

public class EvenFinder {
	public static void main(String[] args) {

		Even even = new Even();
		even.finder(args[0]);
	}

}
