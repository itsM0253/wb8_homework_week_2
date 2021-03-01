import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";
		int result = jewelsStones2(j,s);
		System.out.println(result);

	}
	
	// Solution 1
	public static int jewelsStones1(String jewels, String stones) {
		int num = 0;
		for(int i = 0; i < jewels.length(); i++) {
			for(int j = 0; j < stones.length(); j++) {
				if(jewels.charAt(i) == stones.charAt(j)) {
					num++;
				}
			}
		}
		return num;
	}
	
	// Solution 2 -> using a HashSet
	public static int jewelsStones2(String jewels, String stones) {
		HashSet<Character> set = new HashSet<>();
		int count = 0;
		for(char ch: jewels.toCharArray()) { // adding characters to the set
			set.add(ch);
		}
		
		// traverse through the different stones
		for(char ch: stones.toCharArray()) {
			if(set.contains(ch)) {
				count++;
			}
		}
		return count;
	}
	
	// Solution 3 --> using indexOf
	public static int jewelsStones3(String jewels, String stones) {
		int count = 0;
		// traverse through the stones character by character
		for(int i = 0; i < stones.length(); i++) {
			if(jewels.indexOf(stones.charAt(i)) > -1) {
				count++;
			}
		}
		return count;
	}


}
