import java.util.HashSet;

public class DistributeCandies {

	public static void main(String[] args) {
		int[] candyType = {1,1,2,2,3,3};
		System.out.println(distinctCandies(candyType));
	}
	
	public static int distinctCandies(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		// the doctor advised Alice to eat n/2 
		// to get the differnt types of candies it is the set.size()
		// so comapare n/2 to set.size and choose the minimum number
		return Math.min(arr.length/2, set.size());
	}

}
