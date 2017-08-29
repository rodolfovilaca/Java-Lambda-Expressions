import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
	public static List<Integer> noNeg(List<Integer> nums) {
		return nums.stream().filter((num) -> num >= 0).collect(Collectors.toList());
	}

	public static List<Integer> no9(List<Integer> nums) {
		return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
	}

	public static List<Integer> noTeen(List<Integer> nums) {
		return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
	}

	public static List<String> noLong(List<String> strings) {
		return strings.stream().filter(string -> string.length() < 4).collect(Collectors.toList());
	}

	public static List<String> noZ(List<String> strings) {
		return strings.stream().filter(string -> {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == 'z') {
					return false;
				}
			}
			return true;
		}).collect(Collectors.toList());
	}

	public static List<String> no34(List<String> strings) {
		return strings.stream().filter(string -> string.length() < 3 || string.length() > 4)
				.collect(Collectors.toList());
	}

	public static List<String> noYY(List<String> strings) {
		return strings.stream().map(string -> string + "y").filter(string -> {
			for (int i = 0; i < string.length() - 1; i++) {
				if (string.charAt(i) == 'y' && string.charAt(i + 1) == 'y') {
					return false;
				}
			}
			return true;
		}).collect(Collectors.toList());
	}

	public static List<Integer> two2(List<Integer> nums) {
		return nums.stream().map(num -> num * 2).filter(num -> num % 10 != 2).collect(Collectors.toList());
	}

	public static List<Integer> square56(List<Integer> nums) {
		return nums.stream().map(num -> (num * num) + 10).filter(num -> num % 10 != 5 && num % 10 != 6)
				.collect(Collectors.toList());
	}
}
