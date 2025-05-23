package part3;

public class Runnable_try {
    public static void main(String[] args){
        Runnable obj1= new Runnable() { //using anonymous class if its only used only once
         public void run(){

            for(int i = 1;i <= 10 ; i++){
                System.out.println("hi" + i);
                try{
                    Thread.sleep(10);}
                catch(InterruptedException e){
                }
            }
    }   
        };
        Runnable obj2 = new goal2();

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();//this runs the run() method of that class ,it works only for thread classes
    }
}
// class goal1 implements Runnable{
//     public void run(){
//         for(int i = 1;i <= 10 ; i++){
//             System.out.println("hi" + i);
//             try{
//                 Thread.sleep(10);}
//             catch(InterruptedException e){
//             }
//         }
//     }
// }
class goal2 implements Runnable{
    public void run(){
        for(int i = 1;i <= 10 ; i++){
            System.out.println("hello" + i);
        }
    }
}