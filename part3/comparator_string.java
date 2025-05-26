package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator_string {
    public static void main(String[] args){
        List<String> str = new ArrayList<>();
        Comparator<String> com = new Comparator<String>() {
            public int compare(String str1, String str2){
                if(str1.length() > str2.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }            
        };
        str.add("hatt");
        str.add("challl nikal lode ");
        str.add("madarchod");
        Collections.sort(str,com);
        System.out.println(str);

    }
}
