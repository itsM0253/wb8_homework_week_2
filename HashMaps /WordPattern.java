import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		boolean result = wordPattern(pattern,s);
		System.out.println(result);

	}

	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if(words.length != pattern.length()) {
			return false;
		}
		HashMap<Character,String> map = new HashMap<>();
		for(int i = 0; i < pattern.length(); i++) { // traversing through the pattern
			char current_char = pattern.charAt(i); // grabbed a character from the pattern
			if(map.containsKey(current_char)) {
				if(!map.get(current_char).equals(words[i])) {
					return false;
				}
			}
			else {
				if(map.containsValue(words[i])) { // if the word is already mapped to a character 
					return false; // then you can't map to a different character, automatically false
				}
				map.put(current_char, words[i]);
			}
		}
		return true;
		
	}
}
