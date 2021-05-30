package assignment_5_Apr28th;

public class Wish {
	public static void main(String[] args) {
		String great = args[0];
		String name = args[1];

		if (great.equalsIgnoreCase("AM")) {
			System.out.println("Good Morning " + name);
		} else if (great.equalsIgnoreCase("PM")) {
			System.out.println("Good Evening " + name);
		} else {
			System.out.println("First argument should be either \"AM\" or \"PM\" ");
		}

	}
}
