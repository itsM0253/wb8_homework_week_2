import java.util.*;
public class UniqueMorseCode {

	public static void main(String[] args) {
		String[] input = {"gin", "zen", "gig", "msg"};
		int result = uniqueCode(input);
		System.out.println(result);

	}

	public static int uniqueCode(String[] words) {
		HashSet<String> unique_set = new HashSet<>();
		// array which contains each character morse code at the index(a -> 0)
		String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", 
						".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		
		// traversing through the array of words
		for(String word: words) {
			StringBuilder sb = new StringBuilder();
			// going through all the characters in that word and creating a new string with the morse code 
			for(char ch: word.toCharArray()) {
				sb.append(morse[ch - 'a']); // referencing the index inside the array related to that character
			}
			unique_set.add(sb.toString()); // AFTER I CONVERT TO MORSE CODE, I WILL ADD THAT TO THE SET
		}
		return unique_set.size();
		
	}
}
