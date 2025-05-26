package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class comparator_try {
    public static void main(String[] args){
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(90);
        nums.add(4);
        nums.add(89);
        //Collections.sort(nums); // wjat if i want my own logic like comparing only the last digit of the number
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
