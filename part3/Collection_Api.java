package part3;

import java.util.ArrayList;
import java.util.Collection;

//array is not good way to store data since its fixed.
//So we use Collection Api
//Collection -----> 1.List , 2.Queue, 3.Set
//List----> ArrayList(imp), Linked list
//Queue--->DeQueue
//Set----->Hashset, Linked Hashset(imp)
public class Collection_Api{
    public static void main(String[] args){
        //Collection nums = new ArrayList();
        Collection<Integer> nums = new ArrayList<Integer>();  //we can specify which type of variables we gonna use
        // nums.add(6);
        // nums.add(9);                              //these by default are not integer values they are treated as object
        // nums.add(5);
        // nums.add("6");                            //it gives now compile time error not run time error after stating the type of variable in collection which helps us to try and catch the error. Run time error cant

        try{
            nums.add(6);
            nums.add(9);
            nums.add(5);
            //nums.add("6"); 
        }
        catch(Exception e){
            System.out.println("error:"+e);
        }

        System.out.println(nums);
        for (int n : nums){   //there is no indexing in collection so we have to use enhanced for loop
            System.out.println(n*2);
        }
    }
}