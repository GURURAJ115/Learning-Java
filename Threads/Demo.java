package Threads;

class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getPriority());
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // We can only optimise. Scheduler will decide the priority
        obj2.start();
    }
}