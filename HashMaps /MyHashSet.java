//-create an array of boolean with length 1000001
//-add method means: set true
//-remove method means: set false
//-contains method means: check if true or not
public class MyHashSet {
	boolean[] arr;
	
	/** Initialize your data structure here. */
    public MyHashSet() {
        arr = new boolean[1000001];
    }
    
    public void add(int key) {
        arr[key] = true;
    }
    
    public void remove(int key) {
        arr[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}
