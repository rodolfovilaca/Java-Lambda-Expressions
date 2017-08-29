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
}
