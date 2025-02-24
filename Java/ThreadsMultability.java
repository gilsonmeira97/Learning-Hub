class Count {
    static int count = 0;

    // synchronized is used so that multiples thread do not use a method simutaneously, something that can generate incorrect results.
    static synchronized void increment() {
        count++;
    }
}

public class ThreadsMultability{
    public static void main(String args[]) throws InterruptedException {
        Runnable objA = () -> {
            for(int i=0; i<1000; i++) {
                Count.increment();
            }
        };
        
        Runnable objB = () -> {
            for(int i=0; i<1000; i++) {
                Count.increment();
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

        // join guarantee that the next executing will just happen when the thread work is done.
        t1.join();
        t2.join();

        System.out.printf("Total: %d", Count.count);
    }
}