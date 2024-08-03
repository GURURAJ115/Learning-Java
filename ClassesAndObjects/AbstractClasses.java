public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();
        // Gives error
        System.out.println(c.color);
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
    }
}

abstract class Animal {//Abstract Class
    void eat(){
        System.out.println("Animal Eats");
    }
    //Abstract method
    abstract void walk();
    String color;

    Animal(){//Constructor in Abstract Class
        color = "brown";
    }
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        // color = "white";
    }
    
    void walk(){
        System.out.println("Walks on 3 legs");
    }
}