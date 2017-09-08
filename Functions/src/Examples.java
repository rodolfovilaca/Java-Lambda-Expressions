import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Examples {

	public static Function<List<String>, List<String>> alphabeticalOrder = (list) -> {
		list.sort((s1, s2) -> s1.compareTo(s2));
		return list;
	};

	public static Function<List<Integer>, List<Integer>> numberSorter = (list) -> {
		list.sort((num, num2) -> {
			if (num > num2) {
				return 1;
			} else if (num < num2) {
				return -1;
			} else
				return 0;
		});
		return list;
	};

	public static Function<List<Integer>, Integer> getLowerValue = (list) -> {
		if (list.size() == 0) {
			return 0;
		}
		int low = list.get(0);
		for (Integer num : list) {
			if (num.intValue() < low) {
				low = num.intValue();
			}
		}
		return low;
	};

	public static Function<List<Integer>, Integer> getLowerValueStream = (list) -> {
		IntSummaryStatistics stats = list.stream().mapToInt(num -> num).summaryStatistics();
		return stats.getMin();
	};

	public static Function<List<Integer>, Integer> getAverage = (list) -> {
		IntSummaryStatistics stats = list.stream().mapToInt(num -> num).summaryStatistics();
		return ((int) (stats.getSum()) / list.size());
	};
	
	/*Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

	Your algorithm's runtime complexity must be in the order of O(log n).

	If the target is not found in the array, return [-1, -1].

	For example,
	Given [5, 7, 7, 8, 8, 10] and target value 8,
	return [3, 4].*/

	public static BiFunction<Integer[], Integer, Integer[]> searchRange = (nums, target) -> {
		Integer[] result = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result[0] = i;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == target) {
						result[1] = j;
					}
				}
				return result;
			}
		}
		return result;
	};
	
	// convert a sequence of strings to list of upper case strings
	public static Function<List<String>,List<String>> listToUpper = (list) ->{
		list.replaceAll(string -> string.toUpperCase());
		return list;
	};
	
	 // filter names that are less than four characters long
    public static Function<List<String>,List<String>> filterMaxLength4 = (list) -> {
    	return list.stream()
    			.filter(string -> string.length()<4)
    			.collect(Collectors.toList());
    };
    
    // filter names that are less than four characters long
    // and turn remaining names to uppercase
    public static Function<List<String>,List<String>> filterShortAndTurnToUppercase = (list) ->{
    	List<String> result = list.stream()
    			.filter(string -> string.length()<4)
    			.collect(Collectors.toList());
    	list = list.stream()
    			.filter(string -> string.length()>3)
    			.map(string -> string.toUpperCase())
    			.collect(Collectors.toList());
    	list.forEach(System.out::println);
    	return result;
    };
    
 // turn a string to a sequence of characters
    public static Function<String,char[]> stringToCharArray = string -> {
    	char[] result = new char[string.length()];
    	for(int i=0;i<result.length;i++){
    		result[i] = string.charAt(i);
    	}
    	return result;
    };
}
