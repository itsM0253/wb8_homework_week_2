import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("notebook");
		list.add("notebook");
		list.add("keyboard");
		list.add("mouse");
		list.add("mouse");
		TreeMap<String,Integer> map = new TreeMap<>();
		for(int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			if(!map.containsKey(item)) {
				map.put(item, 1);
			}
			else {
				map.put(item, map.get(item)+1);
			}
		}
		System.out.println(map);
		
		// time to sort the keys (items)
		ArrayList<String> list2 = new ArrayList<>();
		for(String word: map.keySet()) {
			list2.add(word);
		}
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);
		
		// fix the order 
		for(int i= 0; i < list2.size() -1 ; i++) {
			String word1 = list2.get(i);
			String word2 = list2.get(i+1);
			if(map.get(i) == map.get(i+1) && word1.compareTo(word2) > 0 ) {
				//swap 
//				Collections.swap(list2, i, i+1);
			}
		}
System.out.println(list2);
		
		
	}

}
