import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExamplesTestCases {

	@Test
	public void simpleTests() {
		List<String> stringsAlphabeticalOrder = Arrays.asList("apple", "watermelon", "pear", "orange", "kiwi", "grape");
		String[] expectedAlphabeticalOrder = { "apple", "grape", "kiwi", "orange", "pear", "watermelon" };
		String[] resultAlphabeticalOrder = Examples.alphabeticalOrder
													.apply(stringsAlphabeticalOrder)
													.toArray(new String[expectedAlphabeticalOrder.length]);
		assertArrayEquals(resultAlphabeticalOrder, expectedAlphabeticalOrder);

		List<Integer> numsSorter = Arrays.asList(1, 3, 5, 4, 8, 0, 2);
		Integer[] expectedSorter = { 0, 1, 2, 3, 4, 5, 8 };
		Integer[] resultSorter = Examples.numberSorter
											.apply(numsSorter)
											.toArray(new Integer[expectedSorter.length]);
		assertArrayEquals(resultSorter, expectedSorter);
	}

}
