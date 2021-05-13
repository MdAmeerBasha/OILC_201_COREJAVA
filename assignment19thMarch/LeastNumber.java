package assignment19thMarch;

public class LeastNumber {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a < b) {
				System.out.println("smallest number is " + a);
			} else {
				System.out.println("smallest number is " + b);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
