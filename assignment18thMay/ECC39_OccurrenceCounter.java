package ass18thMay;

import java.util.Scanner;

public class ECC39_OccurrenceCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the Search Occurence Counter");
		int num = scanner.nextInt();
		System.out.println(getCount(arr, num));
		scanner.close();
	}

	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		int res = 0;
		if (inputArray.length <= 0) {
			res = -1;
		} else {
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] == givenNumber) {
					count++;
					res = count;
				}
			}
			
		}
		return res;
	}

}
