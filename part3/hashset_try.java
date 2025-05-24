package part3;

import java.util.HashSet;
import java.util.Set;

public class hashset_try {
    public static void main(String[] args){
        Set<Integer> nums= new HashSet<>();
        //A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2),
        //and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
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
