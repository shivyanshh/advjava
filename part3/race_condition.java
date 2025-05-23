package part3;


//basically threads and mutation(changing value) together is a bad combination
// if u have two cards for only one account which holds exactly 1000 rupees
//now one for you and one for your freind if you go to bank assuming u both withdraw exactly 1000 rupees at the exact same time
//it would be a problem right cause u only have 1000 rupees
// File: race_condition.java
public class race_condition {
    public static void main(String[] args) throws InterruptedException {
        c use = new c(); // shared object

        Thread t1 = new Thread(new IncrementTask(use));
        Thread t2 = new Thread(new IncrementTask(use));

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print final result
        System.out.println("Final count: " + use.count);
    }
}

// Separate Runnable class for incrementing
class IncrementTask implements Runnable {
    private c use;

    public IncrementTask(c use) {
        this.use = use;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            use.increment();
        }
    }
}

class c {
    int count = 0;

    public void increment() {
        count++;  // Not synchronized – possible race condition
    }
}


 