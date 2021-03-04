import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetMismatch {

	public static void main(String[] args) {
		int[]  nums = {1,2,2,4};
		int[] nums2 = {3,2,2};
		int[] answer = findErrorNums(nums2);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] findErrorNums(int[] nums) {
		// sort the array, just in case
		Arrays.sort(nums);
		
		Set<Integer> set = new TreeSet<>();
		int[] result = new int[2];
		int nextNum = 0;
		int duplicate = 0;
		
		// if array length is 2 
		if(nums.length == 2) {
			duplicate = nums[0];
			if(duplicate == 1) {
				nextNum = 2;
			}
			if(duplicate == 0) {
				nextNum = 1;
			}
			// [2,2]
			if(duplicate > 1) {
				nextNum = duplicate - 1;
			}
			
		}
		if(nums.length != 2) {
			for(int i = 0; i < nums.length; i++) {
				int digit = nums[i];
				if(!set.contains(digit)) { // 1st time seeing
					set.add(digit);
				}
				else if(set.contains(digit)) {
					set.remove(digit);
					duplicate = digit;
					break;	
				}
			 }
			// now I have my duplicate
		    if(!set.contains(duplicate -1)) {
		    	nextNum = duplicate -1; // found the missing the #
		    }
		    if(!set.contains(duplicate +1)) {
		    	nextNum = duplicate +1; // found the missing the #
		    }
			
		}
		result[0] = duplicate;
		result[1] = nextNum;
		return result;
	}
	
	

}
