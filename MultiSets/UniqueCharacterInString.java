import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		String s = "leetcode";
		int result = firstUnique2(s);
		System.out.println(result);

	}
	
	public static int firstUnique(String str) {
		// keep tracking of each character count using an array
		int[]  letters = new int[26];  // 26 letters in alphabets
		for(char ch: str.toCharArray()) {
			letters[ch - 'a']++; // a is at index 0, and if i see a again count will increment
		}
		// traverse through the array and return the index with the value as 1
		for(int i = 0; i < letters.length; i++) {
			if(letters[str.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		System.out.println(Arrays.toString(letters));
		return -1; // not found 
	}
	
	// Solution 2 -> using a HashMap
	public static int firstUnique2(String str) {
		TreeMap<Character, Integer>  map = new TreeMap<Character,Integer>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(str.charAt(i))) {
				map.put(ch,1);
			}
			else {
				map.put(ch, map.get(ch) + 1); // increment count if u see the character again
			}	
		}
		// traverse through the string and check the value in the map if == 1 and return 
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch) == 1) {
				return i;
			}	
		}
		return -1;
		
	}
	

}
