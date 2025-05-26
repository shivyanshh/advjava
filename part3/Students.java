package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    int age;
    String name;
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    
}
public class Students {
    public static void main(String[] args){
        Comparator<Student> com = new Comparator<Student>() {    // this is comparator
            public int compare(Integer i, Integer j){ //ascending order of age
                if (i%10 > j % 10){
                    return 1;
               }
                else{
                    return -1;
                }
            }
            public int compare(Student i , Student j){
                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        //     public int compareTo(that obj){ //comparable
        // };
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "shivyansh"));
        studs.add(new Student(20, "heer"));
        studs.add(new Student(19, "AKSHIT"));
        //System.out.println(studs);
        Collections.sort(studs,com);
        for(Student s : studs){
            System.out.println(s);
        }
    }
}
