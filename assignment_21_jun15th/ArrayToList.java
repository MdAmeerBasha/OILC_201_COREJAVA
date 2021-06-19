package assignment_21_jun15th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	List<String> convertToList(String[] array) {

		List<String> list = new ArrayList<String>(array.length);
		list = Arrays.asList(array);

		if (array.length == 0 || list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

}
