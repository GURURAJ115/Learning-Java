package MoreOnInterfaces;

// 1.Normal Interface
// 2.Functional Interface (SAM) Single Abstract Method
// 3.Marker Interface(Blank Interface)
@FunctionalInterface
interface A {
    void show();
    // void run(); there should be only one method
    // From java 8 onwards lambda functions were introduced for functional interfaces.
}

public class TypesOfInterface {

    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };This is normal
        A obj = () ->{//You can also return anything and pass any args
                System.out.println("in show");
            };
        // This is Lambda expression -> compiler will do it BTS.
        obj.show();
    }
}
