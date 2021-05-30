package assignment_9_May7th;

public class Pattern9 {
	public static void main(String[] args) {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}

}
