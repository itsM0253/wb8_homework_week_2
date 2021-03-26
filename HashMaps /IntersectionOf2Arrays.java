import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] answer = intersection(nums1,nums2);
		System.out.println(Arrays.toString(answer));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		// adding nums 1 array values to a set
		for(int num: nums1) {
			set.add(num);
		}
		
		HashSet<Integer> intersection = new HashSet<Integer>();
		for(int i: nums2) {
			if(set.contains(i)) {
				intersection.add(i);
			}
		}
		
		// convert set to array 
		int[] arr = new int[intersection.size()];
		int index = 0;
		for(int num : intersection) {
			arr[index] = num;
			index++;
		}
		return arr;
	}
}
