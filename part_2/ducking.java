package part_2;
//Ducking Exception using throws
public class ducking {
    public static void main(String[] args){
        testing obj = new testing();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }    
}
//testing ---- > main method ----- > JVM 
class testing{// basically we throwed the exception on main using this... we can make main throw this on JVM but this will stop excution
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}







// class testing {
//     public void show(){
//         try{
//             Class.forName("Calc"); // ofc we dont have any Calc class here
//         }
//         catch(ClassNotFoundException e){
//             System.out.println("Where The Fuck Is This Class!!");
//         }
//     }
// }
