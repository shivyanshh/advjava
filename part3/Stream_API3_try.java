package part3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream_API3_try {
    public static void main(String[] args){
        List<Integer> nums =  Arrays.asList(2,3,5,4);
        int result =nums.stream()                //this is like a stream of water once passed cant be used and used to process data
                        .filter(n -> n%2 == 0)   // filters elements
                        .map(n -> n*2)           //transforms the data
                        .reduce(0,(sum,number) -> sum+number);   //combines it. sum =0 , number is the next element
        System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                                            .filter(n -> n%2==0)
                                            .sorted();
        sortedValues.forEach(n -> System.out.println(n));
    }
}
