package single_topics;

// class - class -> extends
//class - interface -> implements
//interface - interface - > extends


public class testinterface {
    public static void main(String[] args){
        B obj = new B();
        obj.config();
        System.out.println(B.age);
        System.out.println(B.fav_colour);
        obj.run();
        obj.test();

    } 
}
interface A{
    int age= 8;
    String fav_colour=  "orange";    //variables in interface are final and static


    void show();
    void config();            // in interface all methods are by default public abstract
}
interface X {
    void run();
}

interface Y extends X{
    void test();

    
}


class B implements A,Y {     //u can use multiple interface
    public void show(){
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in config B");
    }
    public void run(){
        System.out.println("in run");
    }
    public void test(){
        System.out.println("im taking test idiot");
    }
}