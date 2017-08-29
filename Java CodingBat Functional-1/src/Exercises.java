import java.util.List;

public class Exercises {

	// Given a list of integers, return a list where each integer is multiplied
	// by 2.

	public static List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll((num) -> 2 * num);
		return nums;
	}

	// Given a list of integers, return a list where each integer is multiplied
	// with itself.

	public static List<Integer> square(List<Integer> nums) {
		nums.replaceAll((num) -> num * num);
		return nums;
	}

	// Given a list of strings, return a list where each string has "*" added at
	// its end.

	public static List<String> addStar(List<String> strings) {
		strings.replaceAll((string) -> string + "*");
		return strings;
	}

	// Given a list of strings, return a list where each string is replaced by 3
	// copies of the string concatenated together.

	public static List<String> copies3(List<String> strings) {
		strings.replaceAll((string) -> string + string + string);
		return strings;
	}

	// Given a list of strings, return a list where each string has "y" added at
	// its start and end.

	public static List<String> moreY(List<String> strings) {
		strings.replaceAll((string) -> "y" + string + "y");
		return strings;
	}

	// Given a list of integers, return a list where each integer is added to 1
	// and the result is multiplied by 10.

	public static List<Integer> math1(List<Integer> nums) {
		nums.replaceAll((num) -> (num + 1) * 10);
		return nums;
	}

	// Given a list of non-negative integers, return an integer list of the
	// rightmost digits. (Note: use %)

	public static List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll((num) -> num % 10);
		return nums;
	}

	// Given a list of strings, return a list where each string is converted to
	// lower case (Note: String toLowerCase() method).

	public static List<String> lower(List<String> strings) {
		strings.replaceAll((string) -> string.toLowerCase());
		return strings;
	}

	// Given a list of strings, return a list where each string has all its "x"
	// removed.

	public static List<String> noX(List<String> strings) {
		strings.replaceAll((string) -> {
			String[] noX = string.split("x");
			String result = "";
			for (String s : noX) {
				result += s;
			}
			return result;
		});
		return strings;
	}

}
