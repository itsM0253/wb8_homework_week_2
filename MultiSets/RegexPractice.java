import java.util.Arrays;

public class RegexPractice {

	public static void main(String[] args) {
		String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String newP2 = p.toLowerCase();
//		System.out.println(newP2);
		String newP = p.replaceAll("[^a-zA-Z]", " ").toLowerCase();
		String[] arr = p.toLowerCase().split("\\W+");
		System.out.println(Arrays.toString(arr));
//		System.out.println(newP);

	}

}
