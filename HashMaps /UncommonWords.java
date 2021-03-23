import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UncommonWords {

	public static void main(String[] args) {
		String A = "this apple is sweet";
		String B = "this apple is sour";
		String[] answer = uncommon(A,B);
		System.out.println(Arrays.toString(answer));

	}
	
	public static String[] uncommon(String A, String B) {
		HashMap<String,Integer> map = new HashMap<>();
		String[] a = A.split(" "); // created array based on spaces
		String[] b = B.split(" ");
		
		// traversing through A array and mapping values and key
		for(int i = 0; i < a.length; i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}
			else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		
		// traversing through B array and mapping values and key
		for(int i = 0; i < b.length; i++) {
			if(!map.containsKey(b[i])) {
				map.put(b[i], 1);
			}
			else {
				map.put(b[i], map.get(b[i]) + 1);
			}
		}
	
		int count = 0;
		// getting the size for the array
		for(String s: map.keySet()) {
			if(map.get(s) == 1) {
				count++;
			}
		}
		
		// adding the values to array
		String[] result = new String[count];
		int index = 0;
		for(String s: map.keySet()) {
			if(map.get(s) == 1) {
				result[index] = s;
				index++;
			}
		}
		return result;
	}

}
