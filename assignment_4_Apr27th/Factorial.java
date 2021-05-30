package assignment_4_Apr27th;

public class Factorial {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				Fact.factFind(num);
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class Fact {
	public static void factFind(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;// 4! = 4*3*2*1 = 24
		}
		System.out.println("Factorial for given number is :  " + fact);

	}
}
