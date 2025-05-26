package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class ConstructorRefEx {
    public static void main(String[] args){
        List<String> names = Arrays.asList("navin","harsh","john");
        List<Studentlist> students = new ArrayList<>();

        // for(String name : names ){
        //     students.add(new Studentlist(name));
        // }
        // System.out.println(students);



        // students = names.stream()
        //                 .map(i -> new Studentlist(i))
        //                 .toList();


        students = names.stream()
                        .map(Studentlist ::new)  //constructor reference
                        .toList();
    }
}

class Studentlist{
    private int age;
    private String name;
    public Studentlist() {
    }
    public Studentlist(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Studentlist [age=" + age + ", name=" + name + "]";
    }
    
}
