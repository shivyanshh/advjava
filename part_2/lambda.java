package part_2;
//lambda expression
interface first{
    void show(int i);
}

public class lambda {
    public static void main(String[] args){
        first obj = i -> System.out.println("in show"+i);  
        // first obj = new first() {
        //     public void show(i){
        //         System.out.println("in show" + i);
        //     }
        // };
        obj.show(5);
        second obj1 = new second() {
            public void sayhello(){
                System.out.println("im saying hello");
            }
        }; 
        obj1.sayhello();
    }
}
interface second{
    void sayhello();
}