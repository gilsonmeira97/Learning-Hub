class A implements Runnable{
    //The class who extends Threads must implement a run method that will execute what you want
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Hi!!!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Hello!!!");
        }
    }

}

public class ThreadsA{
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();

        Thread t1 = new Thread(objA);
        // This does not guarantee that your thread got priority, it just sugest to schedule give more priority
        objB.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        objB.start();
        System.out.println("This is like a third Thread");
    }
}