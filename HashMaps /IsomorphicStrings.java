import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		boolean answer = isIsomorphic(s,t);
		System.out.println(answer);

	}

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character,Character> map = new HashMap<>();
		if(s.length() != t.length()) {
			return false;
		}
		//traverse through the first string
		for(int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if(!map.containsKey(sChar)) {
				if(map.containsValue(tChar)) { // if the word is already mapped to a character 
											   // No two characters may map to the same character
					return false; // then you can't map to a different character, automatically false
				}
				map.put(sChar, tChar);
			}
			else if(map.containsKey(sChar)) {
				if(map.get(sChar) != tChar) { // when you across the same key it Better have the same value
					return false;
				}
			}
		}
		return true;
		
	}
}
