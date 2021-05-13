package assignment21stMarch;

public class ListFactors {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				List.ListFact(num);
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class List {
	public static void ListFact(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) // if number is divided by i then it is the factor
			{
				System.out.print(i + " ");
			}
		}

	}
}
