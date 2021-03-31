import java.util.TreeMap;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map = new TreeMap<>();
		map.put('t',1);
		map.put('r',1);
		map.put('e', 2);
		
		System.out.println(map);

	}

}
