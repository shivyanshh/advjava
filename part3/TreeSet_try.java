package part3;

import java.util.TreeSet;
import java.util.Set;
public class TreeSet_try {
    public static void main(String[] args){
        Set<Integer> nums = new TreeSet<Integer>();
        //Constructs a new, empty tree set, sorted according to the natural ordering of its elements. 
        //All elements inserted into the set must implement the Comparable interface. Furthermore, all such elements must be mutually comparable: e1.compareTo(e2)
        nums.add(8);
        nums.add(0);
        nums.add(8);
        nums.add(51);
        nums.add(100);
        nums.add(1);
        for(int n : nums){
            System.out.println(n);
        }
    }
}
