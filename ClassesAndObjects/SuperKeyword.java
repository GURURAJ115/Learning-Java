public class SuperKeyword {
    public static void main(String[] args) {
        Bird b = new Bird();
        System.out.println(b.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Bird extends Animal{
    Bird(){
        super.color = "brown";
        // Java By default also calles super keyword
        // super();
        System.out.println("I can fly as well");
    }
}
