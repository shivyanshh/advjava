package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API_try {
    public static void main(String[] args){
        List <Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(7);

        Stream<Integer> s1 = nums.stream();  //creates a new list so that there is no affect on original list
        //once used stream you cant use it again
        //Stream<Integer> s2=s1.filter(n-> n%2==0); //only even numbers
        Stream<Integer> s3 = s1.map(n -> n*2);

        //s2.forEach(n->System.out.println(n));
        s3.forEach(n->System.out.println(n));

        // try{

        //     s1.forEach(n -> System.out.println(n));
        //     s1.forEach(n -> System.out.println(n));
        // }
        // catch(Exception e){
        //     System.out.println("exception :"+e);
        // }
    }
}
