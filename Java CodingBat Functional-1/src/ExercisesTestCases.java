import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExercisesTestCases {

	@Test
	public void groudZeroTests() {
		List<Integer> numsDoubling = Arrays.asList();
		Integer[] resultDoubling = Exercises.doubling(numsDoubling).toArray(new Integer[numsDoubling.size()]);
		Integer[] expectedDoubling = {};
		assertArrayEquals(resultDoubling, expectedDoubling);

		List<Integer> numsSquare = Arrays.asList();
		Integer[] resultSquare = Exercises.square(numsSquare).toArray(new Integer[numsSquare.size()]);
		Integer[] expectedSquare = {};
		assertArrayEquals(resultSquare, expectedSquare);

		List<String> stringsAddStar = Arrays.asList();
		String[] resultAddStar = Exercises.addStar(stringsAddStar).toArray(new String[stringsAddStar.size()]);
		String[] expectedAddStar = {};
		assertArrayEquals(resultAddStar, expectedAddStar);

		List<String> stringsCopies3 = Arrays.asList();
		String[] resultCopies3 = Exercises.copies3(stringsCopies3).toArray(new String[stringsCopies3.size()]);
		String[] expectedCopies3 = {};
		assertArrayEquals(resultCopies3, expectedCopies3);

		List<String> stringsMoreY = Arrays.asList();
		String[] resultMoreY = Exercises.moreY(stringsMoreY).toArray(new String[stringsMoreY.size()]);
		String[] expectedMoreY = {};
		assertArrayEquals(resultMoreY, expectedMoreY);

		List<Integer> numsMath1 = Arrays.asList();
		Integer[] resultMath1 = Exercises.math1(numsMath1).toArray(new Integer[numsMath1.size()]);
		Integer[] expectedMath1 = {};
		assertArrayEquals(resultMath1, expectedMath1);

		List<Integer> numsRightDigit = Arrays.asList();
		Integer[] resultRightDigit = Exercises.rightDigit(numsRightDigit).toArray(new Integer[numsRightDigit.size()]);
		Integer[] expectedRightDigit = {};
		assertArrayEquals(resultRightDigit, expectedRightDigit);

		List<String> stringsLower = Arrays.asList();
		String[] resultLower = Exercises.lower(stringsLower).toArray(new String[stringsLower.size()]);
		String[] expectedLower = {};
		assertArrayEquals(resultLower, expectedLower);

		List<String> stringsNoX = Arrays.asList();
		String[] resultNoX = Exercises.noX(stringsNoX).toArray(new String[stringsNoX.size()]);
		String[] expectedNoX = {};
		assertArrayEquals(resultNoX, expectedNoX);
	}

	@Test
	public void simpleTests() {
		List<Integer> numsDoubling = Arrays.asList(1, 2, 3);
		Integer[] resultDoubling = Exercises.doubling(numsDoubling).toArray(new Integer[numsDoubling.size()]);
		Integer[] expectedDoubling = { 2, 4, 6 };
		assertArrayEquals(resultDoubling, expectedDoubling);

		List<Integer> numsSquare = Arrays.asList(1, 2, 3);
		Integer[] resultSquare = Exercises.square(numsSquare).toArray(new Integer[numsSquare.size()]);
		Integer[] expectedSquare = { 1, 4, 9 };
		assertArrayEquals(resultSquare, expectedSquare);

		List<String> stringsAddStar = Arrays.asList("a", "bb", "ccc");
		String[] resultAddStar = Exercises.addStar(stringsAddStar).toArray(new String[stringsAddStar.size()]);
		String[] expectedAddStar = { "a*", "bb*", "ccc*" };
		assertArrayEquals(resultAddStar, expectedAddStar);

		List<String> stringsCopies3 = Arrays.asList("a", "bb", "ccc");
		String[] resultCopies3 = Exercises.copies3(stringsCopies3).toArray(new String[stringsCopies3.size()]);
		String[] expectedCopies3 = { "aaa", "bbbbbb", "ccccccccc" };
		assertArrayEquals(resultCopies3, expectedCopies3);

		List<String> stringsMoreY = Arrays.asList("a", "b", "c");
		String[] resultMoreY = Exercises.moreY(stringsMoreY).toArray(new String[stringsMoreY.size()]);
		String[] expectedMoreY = { "yay", "yby", "ycy" };
		assertArrayEquals(resultMoreY, expectedMoreY);

		List<Integer> numsMath1 = Arrays.asList(1, 2, 3);
		Integer[] resultMath1 = Exercises.math1(numsMath1).toArray(new Integer[numsMath1.size()]);
		Integer[] expectedMath1 = { 20, 30, 40 };
		assertArrayEquals(resultMath1, expectedMath1);

		List<Integer> numsRightDigit = Arrays.asList(1, 22, 93);
		Integer[] resultRightDigit = Exercises.rightDigit(numsRightDigit).toArray(new Integer[numsRightDigit.size()]);
		Integer[] expectedRightDigit = { 1, 2, 3 };
		assertArrayEquals(resultRightDigit, expectedRightDigit);

		List<String> stringsLower = Arrays.asList("Hello", "Hi");
		String[] resultLower = Exercises.lower(stringsLower).toArray(new String[stringsLower.size()]);
		String[] expectedLower = { "hello", "hi" };
		assertArrayEquals(resultLower, expectedLower);

		List<String> stringsNoX = Arrays.asList("ax", "bb", "cx");
		String[] resultNoX = Exercises.noX(stringsNoX).toArray(new String[stringsNoX.size()]);
		String[] expectedNoX = { "a", "bb", "c" };
		assertArrayEquals(resultNoX, expectedNoX);
		
	}

	@Test
	public void moreComplexTests() {
		List<Integer> numsDoubling = Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2);
		Integer[] resultDoubling = Exercises.doubling(numsDoubling).toArray(new Integer[numsDoubling.size()]);
		Integer[] expectedDoubling = { 12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4 };
		assertArrayEquals(resultDoubling, expectedDoubling);

		List<Integer> numsSquare = Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2);
		Integer[] resultSquare = Exercises.square(numsSquare).toArray(new Integer[numsSquare.size()]);
		Integer[] expectedSquare = { 36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4 };
		assertArrayEquals(resultSquare, expectedSquare);

		List<String> stringsAddStar = Arrays.asList("kittens", "and", "chocolate", "and");
		String[] resultAddStar = Exercises.addStar(stringsAddStar).toArray(new String[stringsAddStar.size()]);
		String[] expectedAddStar = { "kittens*", "and*", "chocolate*", "and*" };
		assertArrayEquals(resultAddStar, expectedAddStar);

		List<String> stringsCopies3 = Arrays.asList("this", "and", "that", "and");
		String[] resultCopies3 = Exercises.copies3(stringsCopies3).toArray(new String[stringsCopies3.size()]);
		String[] expectedCopies3 = { "thisthisthis", "andandand", "thatthatthat", "andandand" };
		assertArrayEquals(resultCopies3, expectedCopies3);

		List<String> stringsMoreY = Arrays.asList("hello", "there");
		String[] resultMoreY = Exercises.moreY(stringsMoreY).toArray(new String[stringsMoreY.size()]);
		String[] expectedMoreY = { "yhelloy", "ytherey" };
		assertArrayEquals(resultMoreY, expectedMoreY);

		List<Integer> numsMath1 = Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2);
		Integer[] resultMath1 = Exercises.math1(numsMath1).toArray(new Integer[numsMath1.size()]);
		Integer[] expectedMath1 = { 70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30 };
		assertArrayEquals(resultMath1, expectedMath1);

		List<Integer> numsRightDigit = Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2);
		Integer[] resultRightDigit = Exercises.rightDigit(numsRightDigit).toArray(new Integer[numsRightDigit.size()]);
		Integer[] expectedRightDigit = { 6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2 };
		assertArrayEquals(resultRightDigit, expectedRightDigit);

		List<String> stringsLower = Arrays.asList("aaX", "bYb", "Ycc", "ZZZ");
		String[] resultLower = Exercises.lower(stringsLower).toArray(new String[stringsLower.size()]);
		String[] expectedLower = { "aax", "byb", "ycc", "zzz" };
		assertArrayEquals(resultLower, expectedLower);

		List<String> stringsNoX = Arrays.asList("this", "is", "the", "x");
		String[] resultNoX = Exercises.noX(stringsNoX).toArray(new String[stringsNoX.size()]);
		String[] expectedNoX = { "this", "is", "the", "" };
		assertArrayEquals(resultNoX, expectedNoX);
	}

}
