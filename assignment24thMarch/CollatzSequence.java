package assignment24thMarch;

public class CollatzSequence {

	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(args[0]);
			if (num >= 1 && num <= 100) {
				Sequence.getSequence(num);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}

class Sequence {
	public static void getSequence(int num) {

		while (num != 1) {

			System.out.print(num + " ");

			if ((num % 2 != 0)) {
				num = (3 * num + 1);
			} else {
				num = (num / 2);
			}

		}
		System.out.println(num);

	}
}
