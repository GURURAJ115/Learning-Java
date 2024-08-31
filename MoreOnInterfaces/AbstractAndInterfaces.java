package MoreOnInterfaces;

// by default in interfaces methods will be abstract
interface A {
    // int age; You cant just initialize you also have to define it 
    // Because variables are final and static by default
    int age=35;
    void show();
    void config();
}
// Class - class = extends
// Class - interface = implements
// interface - interface = extends
interface X{
    public void run();
}
interface Y extends X{
    
}
class B implements A,Y {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    public void run(){
        // It can implement both interfaces but you have to define this method
    }
}

public class AbstractAndInterfaces {
    public static void main(String[] args) {
        A obj;
        // obj = new A(); Cannot instantiate
        obj = new B();
        obj.show();
        obj.config();
        // A.age = 69 Not possible bcz it is final
        System.out.println(A.age);
    }
}
