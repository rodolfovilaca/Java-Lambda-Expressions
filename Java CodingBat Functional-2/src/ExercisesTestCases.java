import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExercisesTestCases {

	@Test
	public void groundZeroTest() {
		List<Integer> numsNoNeg = Arrays.asList();
		Integer[] resultNoNeg = Exercises.noNeg(numsNoNeg).toArray(new Integer[numsNoNeg.size()]);
		Integer[] expectedNoNeg = {};
		assertArrayEquals(resultNoNeg, expectedNoNeg);

		List<Integer> numsNo9 = Arrays.asList();
		Integer[] resultNo9 = Exercises.no9(numsNo9).toArray(new Integer[numsNo9.size()]);
		Integer[] expectedNo9 = {};
		assertArrayEquals(resultNo9, expectedNo9);

		List<Integer> numsNoTeen = Arrays.asList();
		Integer[] resultNoTeen = Exercises.noNeg(numsNoTeen).toArray(new Integer[numsNoTeen.size()]);
		Integer[] expectedNoTeen = {};
		assertArrayEquals(resultNoTeen, expectedNoTeen);

		List<String> stringsNoLong = Arrays.asList();
		String[] resultNoLong = Exercises.noLong(stringsNoLong).toArray(new String[stringsNoLong.size()]);
		String[] expectedNoLong = {};
		assertArrayEquals(resultNoLong, expectedNoLong);

		List<String> stringsNoZ = Arrays.asList();
		String[] resultNoZ = Exercises.noZ(stringsNoZ).toArray(new String[stringsNoZ.size()]);
		String[] expectedNoZ = {};
		assertArrayEquals(resultNoZ, expectedNoZ);

		List<String> stringsNo34 = Arrays.asList();
		String[] resultNo34 = Exercises.no34(stringsNo34).toArray(new String[stringsNo34.size()]);
		String[] expectedNo34 = {};
		assertArrayEquals(resultNo34, expectedNo34);

		List<String> stringsNoYY = Arrays.asList();
		String[] resultNoYY = Exercises.noYY(stringsNoYY).toArray(new String[stringsNoYY.size()]);
		String[] expectedNoYY = {};
		assertArrayEquals(resultNoYY, expectedNoYY);

		List<Integer> numsTwo2 = Arrays.asList();
		Integer[] resultTwo2 = Exercises.two2(numsTwo2).toArray(new Integer[numsTwo2.size()]);
		Integer[] expectedTwo2 = {};
		assertArrayEquals(resultTwo2, expectedTwo2);

		List<Integer> numsSquare56 = Arrays.asList();
		Integer[] resultSquare56 = Exercises.square56(numsSquare56).toArray(new Integer[numsSquare56.size()]);
		Integer[] expectedSquare56 = {};
		assertArrayEquals(resultSquare56, expectedSquare56);
	}

	@Test
	public void simpleTests() {
		List<Integer> numsNoNeg = Arrays.asList(1, -2);
		Integer[] expectedNoNeg = { 1 };
		Integer[] resultNoNeg = Exercises.noNeg(numsNoNeg).toArray(new Integer[expectedNoNeg.length]);
		assertArrayEquals(resultNoNeg, expectedNoNeg);

		List<Integer> numsNo9 = Arrays.asList(1, 2, 19);
		Integer[] expectedNo9 = { 1, 2 };
		Integer[] resultNo9 = Exercises.no9(numsNo9).toArray(new Integer[expectedNo9.length]);
		assertArrayEquals(resultNo9, expectedNo9);

		List<Integer> numsNoTeen = Arrays.asList(1, 14, 1);
		Integer[] expectedNoTeen = { 1, 1 };
		Integer[] resultNoTeen = Exercises.noTeen(numsNoTeen).toArray(new Integer[2]);
		assertArrayEquals(resultNoTeen, expectedNoTeen);

		List<String> stringsNoLong = Arrays.asList("a", "bbb", "cccc");
		String[] expectedNoLong = { "a", "bbb" };
		String[] resultNoLong = Exercises.noLong(stringsNoLong).toArray(new String[expectedNoLong.length]);
		assertArrayEquals(resultNoLong, expectedNoLong);

		List<String> stringsNoZ = Arrays.asList("aaa", "bbb", "aza");
		String[] expectedNoZ = { "aaa", "bbb" };
		String[] resultNoZ = Exercises.noZ(stringsNoZ).toArray(new String[expectedNoZ.length]);
		assertArrayEquals(resultNoZ, expectedNoZ);

		List<String> stringsNo34 = Arrays.asList("a", "bb", "ccc");
		String[] expectedNo34 = { "a", "bb" };
		String[] resultNo34 = Exercises.no34(stringsNo34).toArray(new String[expectedNo34.length]);
		assertArrayEquals(resultNo34, expectedNo34);

		List<String> stringsNoYY = Arrays.asList("a", "b", "c");
		String[] resultNoYY = Exercises.noYY(stringsNoYY).toArray(new String[stringsNoYY.size()]);
		String[] expectedNoYY = { "ay", "by", "cy" };
		assertArrayEquals(resultNoYY, expectedNoYY);

		List<Integer> numsTwo2 = Arrays.asList(1, 2, 3);
		Integer[] expectedTwo2 = { 4, 6 };
		Integer[] resultTwo2 = Exercises.two2(numsTwo2).toArray(new Integer[expectedTwo2.length]);
		assertArrayEquals(resultTwo2, expectedTwo2);

		List<Integer> numsSquare56 = Arrays.asList(3, 1, 4);
		Integer[] expectedSquare56 = { 19, 11 };
		Integer[] resultSquare56 = Exercises.square56(numsSquare56).toArray(new Integer[expectedSquare56.length]);
		assertArrayEquals(resultSquare56, expectedSquare56);
		
	}

	@Test
	public void complexTests() {
		List<Integer> numsNoNeg = Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5);
		Integer[] expectedNoNeg = { 3, 1, 5 };
		Integer[] resultNoNeg = Exercises.noNeg(numsNoNeg).toArray(new Integer[expectedNoNeg.length]);
		assertArrayEquals(resultNoNeg, expectedNoNeg);

		List<Integer> numsNo9 = Arrays.asList(45, 99, 90, 28, 13, 999, 0);
		Integer[] expectedNo9 = { 45, 90, 28, 13, 0 };
		Integer[] resultNo9 = Exercises.no9(numsNo9).toArray(new Integer[expectedNo9.length]);
		assertArrayEquals(resultNo9, expectedNo9);

		List<Integer> numsNoTeen = Arrays.asList(-16, 2, 15, 3, 16, 25);
		Integer[] expectedNoTeen = { -16, 2, 3, 25 };
		Integer[] resultNoTeen = Exercises.noTeen(numsNoTeen).toArray(new Integer[expectedNoTeen.length]);
		assertArrayEquals(resultNoTeen, expectedNoTeen);

		List<String> stringsNoLong = Arrays.asList("aaaa", "bbb", "***", "333");
		String[] expectedNoLong = { "bbb", "***", "333" };
		String[] resultNoLong = Exercises.noLong(stringsNoLong).toArray(new String[expectedNoLong.length]);
		assertArrayEquals(resultNoLong, expectedNoLong);

		List<String> stringsNoZ = Arrays.asList("hello", "howz", "are", "youz");
		String[] expectedNoZ = { "hello", "are" };
		String[] resultNoZ = Exercises.noZ(stringsNoZ).toArray(new String[expectedNoZ.length]);
		assertArrayEquals(resultNoZ, expectedNoZ);

		List<String> stringsNo34 = Arrays.asList("aaaa", "bbb", "*****", "333");
		String[] expectedNo34 = { "*****" };
		String[] resultNo34 = Exercises.no34(stringsNo34).toArray(new String[expectedNo34.length]);
		assertArrayEquals(resultNo34, expectedNo34);

		List<String> stringsNoYY = Arrays.asList("yyx", "y", "zzz");
		String[] expectedNoYY = { "zzzy" };
		String[] resultNoYY = Exercises.noYY(stringsNoYY).toArray(new String[expectedNoYY.length]);
		assertArrayEquals(resultNoYY, expectedNoYY);

		List<Integer> numsTwo2 = Arrays.asList(3, 1, 4, 1, 6, 99, 0);
		Integer[] expectedTwo2 = { 6, 8, 198, 0 };
		Integer[] resultTwo2 = Exercises.two2(numsTwo2).toArray(new Integer[expectedTwo2.length]);
		assertArrayEquals(resultTwo2, expectedTwo2);

		List<Integer> numsSquare56 = Arrays.asList(3, -1, -4, 1, 5, 9);
		Integer[] expectedSquare56 = { 19, 11, 11, 91 };
		Integer[] resultSquare56 = Exercises.square56(numsSquare56).toArray(new Integer[expectedSquare56.length]);
		assertArrayEquals(resultSquare56, expectedSquare56);
	}
}
