package assignment_21_jun15th;

import java.util.HashSet;
import java.util.Set;

public class SetCopy {
	 int copySet(Set<Integer> h1, Set<Integer> h2) {
		int result = 0;

		if (h1.equals(null) || h1.size() == 0) {
			result = 1;
		} else {
			for (Integer x : h1) {
				h2.add(x);
			}

		}
		System.out.println(h2);
		return result;
	}

}
