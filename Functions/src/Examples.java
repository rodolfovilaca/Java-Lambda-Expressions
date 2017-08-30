import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class Examples {
	
	public static Function<List<String>,List<String>> alphabeticalOrder = (list) -> {
		list.sort((s1,s2)->s1.compareTo(s2));
		return list;
		};
		
	public static Function<List<Integer>,List<Integer>> numberSorter = (list) -> {
		list.sort((num , num2) -> {
			if(num>num2){
				return 1;
			}else if(num<num2){
				return -1;
			}else return 0;
			});
		return list;
	};
	
	public static Function<List<Integer>,Integer> getLowerValue = (list) -> {
		int low = list.get(0);
		for(Integer num : list){
			if(num.intValue()<low){
				low = num.intValue();
			}
		}
		return low;
	};
	
	public static Function<List<Integer>,Integer> getLowerValueStream = (list) -> {
		IntSummaryStatistics stats = list.stream().mapToInt(num -> num).summaryStatistics();
		return stats.getMin();
	};
	
	public static Function<List<Integer>,Integer> getAverage = (list) -> {
		IntSummaryStatistics stats = list.stream().mapToInt(num -> num).summaryStatistics();
		return ((int)(stats.getSum())/list.size());
	};
	
}
