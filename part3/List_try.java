package part3;
import java.util.ArrayList;
import java.util.List;
public class List_try {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(6);
        int i =0;
        for(int n : nums){
            System.out.println("value at index "+ i+ " is:" + n);
            i++;
        }

    }
}
