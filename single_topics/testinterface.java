package single_topics;

public class testinterface {
    public static void main(String[] args){
        B obj = new B();
        obj.config();
        System.out.println(B.age);
        System.out.println(B.fav_colour);
    } 
}
interface A{
    int age= 8;
    String fav_colour=  "orange";    //variables in interface are final and static


    void show();
    void config();            // in interface all methods are by default public abstract
}
class B implements A {
    public void show(){
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in config B");
    }
}