import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

	public static void main(String[] args) {
		String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		String answer = mostCommon(p,banned);
		System.out.println(answer);

	}
	
	public static String mostCommon(String paragraph, String[] banned) {
		HashSet<String> set = new HashSet<>(); // will store the banned words
		HashMap<String,Integer> map = new HashMap<>();
		
		// adding the banned words to the set
		for(String bannedWord : banned) {
			set.add(bannedWord);
		}
		
		// now time to add words to the map and keep track of the count 
		String[] words = paragraph.toLowerCase().split("\\W+");
		for(String word : words) {
			if(!set.contains(word)) {
				if(!map.containsKey(word)) {
					map.put(word, 1);
				}
				else {
					map.put(word, map.get(word) +1);
				}
			}
		}
		
		// Last step, would be to get the most Frequent word in the map and return that word
		int max = 0;
		String result = " ";
		for(String word : map.keySet()) {
			if(map.get(word) > max) {
				max = map.get(word);
				result = word;
			}
		}
		return result;
	}
	
	

}
