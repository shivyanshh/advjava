package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;
public class optionalClass {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("shivyansh");
        names.add("heer");
        names.add("akshit");

        // Optional<String> name = names.stream()
        //                     .filter(str -> str.contains("a"))    //we use optional class so that if there is no element in the list after gettting filtered out it atleast doesnt give us "NULL POINT EXCEPTION"
        //                     .findFirst()
        //                     .orElse("not found");

        String name = names.stream()
                            .filter(str -> str.contains("a"))   
                            .findFirst()
                            .orElse("not found");
        //System.out.println(name.get());                          //EITHER WE CAN USE THIS IF WE ARE SURE THERE IS ATLEAST ONE ELEMENT
        //System.out.println(name.orElse("not found"));            //Or this 
        System.out.println(name);
        }
}
