import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		String[] a = (String[]) list.toArray();

	}

}
