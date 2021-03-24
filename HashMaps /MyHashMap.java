import java.util.Arrays;
public class MyHashMap {
	int[] arr; // HashMaps are built using an array data structure
	
	/** Initialize your data structure here. */
	public MyHashMap() {
		arr = new int[10000001];
		Arrays.fill(arr, -1);
	}
	
	/** value will always be non-negative. */
	public void put(int key, int value) {
		arr[key] = value;
	}
	
	 /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return arr[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arr[key] = -1;
    }
    
    
}
