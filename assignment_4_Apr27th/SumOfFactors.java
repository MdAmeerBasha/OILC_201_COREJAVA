package assignment_4_Apr27th;

public class SumOfFactors {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			SumFact.FindSumFact(num);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class SumFact {
	public static void FindSumFact(int num) {

		if (num > 0) {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					sum = sum + i;
			}
			System.out.println(sum);

		} else {
			System.out.println("Error");
		}
	}
}
