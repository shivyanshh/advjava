package part_2;
@FunctionalInterface
interface demo{ //functional interface
    void show();
    //void tell();
}
// class prac implements demo{
//     public void show(){
//         System.out.println("in show");
//     }

// }
public class functional_interface {
    public static void main(String[] args){
        demo obj = new demo(){
            public void show(){
                System.out.println("in show"); //using anonymous objects
            }
        };
        obj.show();
    }
}
