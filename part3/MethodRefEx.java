package part3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class MethodRefEx {
    public static void main(String[] args){
        List<String> names = Arrays.asList("navin","harsh","john");

        List<String> uNames = names.stream()
                                   .map(String :: toUpperCase)                    //method reference
                                // .map(i -> i.toUpperCase())
                                   .toList();
        // System.out.println(uNames);
        uNames.forEach(i->System.out.println(i));
    }
}
