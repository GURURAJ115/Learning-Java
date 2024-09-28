package Threads;

class A implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsUsingRunnable {
    public static void main(String[] args) {
        // Reference of interface and object of a class
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        // Thread class has a constructor that accepts runnable object as an argument.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}