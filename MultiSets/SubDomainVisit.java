import java.util.*;
public class SubDomainVisit {

	public static void main(String[] args) {
		String[] domains = {"9001 discuss.leetcode.com"};
		String[] domains2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		ArrayList<String> list = subdomainCount(domains2);
		System.out.println(list);

	}
	
	public static ArrayList<String> subdomainCount(String[] cpdomains) {
		 HashMap<String, Integer> map = new HashMap<>(); // created a map
	        
		 	// traversing through the array of domains
	        for(String s: cpdomains){
	            String[] array = s.split(" "); // created a new array ["9001","discuss.leetcode.com"]
	            int num = Integer.parseInt(array[0]); // grabbing the number
	            int len = array[1].length(); // I know the size of the domain
	            
	            // Filling up my map so, key = my domain, value = number
	            if(map.containsKey(array[1])){
	                map.put(array[1], map.get(array[1]) + num);
	            }else{
	                map.put(array[1], num);
	            }
	            System.out.println(map);
	            
	            // NOW, I am iterating 1 specific domain 
	            for(int i = 0; i < len; i++){
	                if(array[1].charAt(i) == '.'){
	                    String temp = array[1].substring(i+1, len); // temp is now holding the sub domain 
	                    // I have to add the sub domain into the map
	                    if(map.containsKey(temp)){
	                            map.put(temp, map.get(temp) + num);
	                        }else{
	                            map.put(temp, num);
	                        }
	                }
	            }
	        }
	        
	        ArrayList<String> ans = new ArrayList<>();
	        
	        for(Map.Entry<String, Integer> entry: map.entrySet()){
	            String num = entry.getValue() + "";
	            ans.add(num + " " + entry.getKey());
	        }
	        
	        return ans;
		}
		

}
