package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class need_StreamAPI {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(7);


        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);
        //nums.forEach(n -> System.out.println(n));

        // for(int i =0 ; i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        // for (int n : nums){
        //     System.out.println(n);
        // }





        // int sum = 0;
        // for(int n : nums){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum += n;
        //     }
        //     else{
        //         continue;
        //     }
        // }
        // System.out.println("Sum: "+sum);
        
        }
    }

