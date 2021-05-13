package assignment24thMarch;

public class OccurrenceCounter {
	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for(int i = 0; i<inputArray.length; i++) {
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2, 8, 12, 12, 14, 12, 1, 10, 5, 2, 1};
		 int num = 12;
		 System.out.println(getCount(arr, num));
	}

}
