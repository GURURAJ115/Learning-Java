public class Destructors {
    public static void main(String[] args) {
        // There is no need to use destructors in java as it will be done by java itself using garbage collectors.
        Fish shark = new Fish();
        shark.eat();
        Amphibians Crocodile = new Amphibians();
        Crocodile.swim();
        Crocodile.breathe();
        Crocodile.both();
    }
}
// Inheritance
class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
// Single level Inheritance - One base class - one derived class

// Multi level inheritance - one base - derived - derived
class Amphibians extends Fish{
    void both(){
        System.out.println("I can live both sides");
    }
}

// Hierarchical Inheritance'
    // 1
// 1       1

// Hybrid Inheriance
    // 1
// 1       1
// 2

// Multiple inheritance
// 1      1
    // 1
    //  This is not in java but it can be achieved through interfaces.


