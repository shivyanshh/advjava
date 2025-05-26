package part3;

import java.util.Map;
import java.util.HashMap;
//An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
//This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface.
public class Map_try {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>();
        students.put("heer", 56);
        students.put("akshit", 78);
        students.put("keya", 90);
        students.put("keya",95);
// keys are sets and values are list
        // System.out.println(students);
        for(String key : students.keySet()){
            System.out.println(key+":"+students.get(key));
        }
    }
}
