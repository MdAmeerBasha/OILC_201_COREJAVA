package assignment_21_jun15th;

import java.util.List;

public class ListToArray {
	Integer[] convertListToArray(List<Integer> list) {
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		return array;
	}

}
