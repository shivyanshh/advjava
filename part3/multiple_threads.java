package part3;
class A extends Thread{
    public void run(){
        for(int i = 1;i <= 10 ; i++){
            System.out.println("hi" + i);
            try{
                Thread.sleep(10);}
            catch(InterruptedException e){
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 1;i <= 10 ; i++){
            System.out.println("hello" + i);
        }
    }
}
public class multiple_threads {
    public static void main(String[] args){
        A obj1= new A();
        B obj2 = new B();

        System.out.println((obj1.getPriority()));
        System.out.println((obj2.getPriority())); //priority 1 (least) to 10(max)
        obj2.setPriority(Thread.MAX_PRIORITY);//WE CAN ONLY SUGGEST IT DOESNT MEAN IT WILL PRINT IT FIRST

        obj1.start();
        obj2.start();//this runs the run() method of that class
    }
}
