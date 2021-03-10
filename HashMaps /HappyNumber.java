import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		int num = 100;
		boolean result = isHappy(num);
		System.out.println(result);

	}

	public static boolean isHappy(int n) {
		 HashSet<Integer> set = new HashSet<>(); // keep tracks of having not coming across the same sum again which, could result in a infinite loop
		 while(n != 1) { // the loop ends once you reach 1
			 if(set.contains(n)) { // checking if the set already contains that number already, I don't want an infinite loop
				 return false;
			 }
			 set.add(n); // else add it to the set
			 n = findNext(n); // now, calculate the new n
		 }
		 return true;
	}
	
	public static int findNext(int n) {
		int sum = 0;
		while(n > 0) { // loop, to go through every digit in the number and i will be updating it by n = n / 10
			sum += (n % 10) * (n % 10);
			System.out.println(sum);
			n = n / 10;
			System.out.println(n);
		}
		return sum;
	}
}
