import java.util.ArrayList;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("a");
		a.add("b");
		a.add("cd");
		a.add("cd");
		a.add("ef");
		a.add("ef");
		
		Set<String> result = search(a);
		System.out.print(result);
	}
	
	public static Set<String> search(ArrayList<String> list) {
		Set<String> set = new HashSet<>();
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0; i < list.size(); i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			}
			else {
				map.put(list.get(i), map.get(list.get(i)) +1);
			}
		}
		for(String word: map.keySet()) {
			if(map.get(word) == 2) {
				set.add(word);
			}
		}
		return set;
	}

}
