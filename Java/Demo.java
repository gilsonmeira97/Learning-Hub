class A extends Thread {
    //The class who extends Threads must implement a run method that will execute what you want
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Hi!!!");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Hello!!!");
        }
    }
}

public class Demo{
    public static void main(String args[]) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();
    }
}