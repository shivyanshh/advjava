package part3;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.stream.Stream;
public class parallel_streamtry {
    public static void main(String[] args){
        //List<Integer> nums = Arrays.asList(2,3,4,5,6,7);
        List<Integer> nums = new ArrayList<>(10000);//ofc all values will be zero
        Random ran = new Random();
        for(int i = 0;i <= 10000;i++){
            nums.add(ran.nextInt(100));
        }
        // ran.nextInt(100);
        //System.out.println(nums); very big list dont print it

        // int sum1  = nums.stream()
        //                 .map(i -> i*2)
        //                 .reduce(0, (c,e) -> c+e);    //this is tricky so we can use mapToInt
        //System.out.println(sum1);


        long startseq = System.currentTimeMillis();
        int sum2 = nums.stream()
                      .map(i -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                            System.out.println("oopsie");
                        }
                        return i*2;})
                      .mapToInt(i -> i)     //converting any - > int
                      .sum();               //sum cannot be used on any type only int so we need to convert it into int
        long endseq = System.currentTimeMillis();





        long startpara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()     //basically parallel stream ideally should be slow but it isnt and while using the thread.sleep method we can see how much actual time difference
                                             // it takes between stream and parallel stream
                      .map(i -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                            System.out.println("oopsie");
                        }
                        return i*2;})
                      .mapToInt(i -> i)     
                      .sum();
        long endpara = System.currentTimeMillis();


        System.out.println(sum3 + " "+ sum2);
        System.out.println("seq :"+(endseq-startseq));
        System.out.println("para :"+ (endpara-startpara));

    }
}
