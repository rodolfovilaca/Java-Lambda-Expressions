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
		
		List<Integer> numsLowerValue = Arrays.asList(3,2,1);
		Integer expecteLowerValue = 1;
		Integer resultLowerValue = Examples.getLowerValue
											.apply(numsLowerValue);
		assertEquals(resultLowerValue, expecteLowerValue);
		
		List<Integer> numsLowerValueStream = Arrays.asList(1,2,3);
		Integer expecteLowerValueStream = 1;
		Integer resultLowerValueStream = Examples.getLowerValueStream
											.apply(numsLowerValueStream);
		assertEquals(resultLowerValueStream, expecteLowerValueStream);
		
		List<Integer> numsAverage = Arrays.asList(1,2,3);
		Integer expectedAverage = 2;
		Integer resultAverage = Examples.getAverage
											.apply(numsAverage);
		assertEquals(resultAverage, expectedAverage);
		
		List<String> stringsToUpper = Arrays.asList("bacon","eggs","milk");
		String[] expectedToUpper = {"BACON","EGGS","MILK"};
		String[] actualToUpper = Examples.listToUpper
													.apply(stringsToUpper)
													.toArray(new String[stringsToUpper.size()]);
		assertArrayEquals(expectedToUpper, actualToUpper);
		
		List<String> stringsMaxLength4 = Arrays.asList("bacon","eggs","milk","tea","coffe","egg");
		String[] expectedMaxLength4 = {"tea","egg"};
		String[] actualMaxLength4 = Examples.filterMaxLength4
													.apply(stringsMaxLength4)
													.toArray(new String[expectedMaxLength4.length]);
		assertArrayEquals(expectedMaxLength4, actualMaxLength4);
		
		List<String> stringsFilterAndUpper = Arrays.asList("bacon","eggs","milk","tea","coffe","egg");
		String[] expectedFilterAndUpper = {"tea","egg"};
		String[] actualFilterAndUpper = Examples.filterShortAndTurnToUppercase
													.apply(stringsFilterAndUpper)
													.toArray(new String[expectedMaxLength4.length]);
		assertArrayEquals(expectedFilterAndUpper, actualFilterAndUpper);
		
	}
	
	@Test
	public void searchRangeTests(){
		
		Integer[] arrGroundZero  = {};
		Integer[] expectedGroundZero = {-1,-1};
		Integer[] resultGroundZero = Examples.searchRange.apply(arrGroundZero,0);
		assertArrayEquals(resultGroundZero, expectedGroundZero);
		
		Integer[] arrOnlyTheNums  = {2,2};
		Integer[] expectedOnlyTheNums = {0,1};
		Integer[] resultOnlyTheNums = Examples.searchRange.apply(arrOnlyTheNums,2);
		assertArrayEquals(resultOnlyTheNums, expectedOnlyTheNums);
		
		Integer[] arr  = {0,2,4,4,4,5,6};
		Integer[] expected = {2,4};
		Integer[] result = Examples.searchRange.apply(arr,4);
		assertArrayEquals(result, expected);
	}
}
