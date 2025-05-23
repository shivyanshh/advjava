package part3;

public class race_condition2 {
    public static void main(String[] args) {
        count use = new count();
        Runnable obj1 = new Runnable() {

            @Override
            public void run() {
                
                for (int i = 1; i <= 3000; i++) {
                    use.increment();
        }
    }
};
        Runnable obj2 = new Runnable() {
            public void run(){
                for (int i = 1; i <= 3000; i ++){
                    use.increment();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //initalisation
        t1.start();
        t2.start();

        // t1.join();
        // t2.join();

        try{
            t1.join(); // ask main thread to wait for these two threads but still you wont get the max output since threads are unpredictable 
            t2.join();
        }
        catch (InterruptedException e){
             System.out.println("PROBLEM:"+ e);
        }
         catch(Exception e){
             System.out.println("Something Went Wrong:"+e);
        }
        System.out.println("final :" + use.c);    

};

    }

// you gonna get lots of different values cause assume the two threads access the common variable at same time when its value is 0 then they will both
//increment at the same time. but the common variable will be 1 so it will lose some iterations. that is why we get different outputs since
//we lose it
class count {
    int c;
    public synchronized void increment(){  //using synchronized keyword it make sures one thread is accesing this at one time
        //which prevents the loss of iterations
        c++;
    }
}
