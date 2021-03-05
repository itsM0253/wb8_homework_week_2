import java.util.*;
public class MapEntry {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Mohamud", 20);
		map.put("Kobe", 24);
		
		for(Map.Entry<String, Integer> entry: map.entrySet()){
            String num = entry.getValue() + "";
            System.out.println(num + " " + entry.getKey());
        }

	}

}
