public class JewelsAndStones {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";
		int result = jewelsStones1(j,s);
		System.out.println(result);

	}
	
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


}
