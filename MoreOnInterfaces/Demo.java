package MoreOnInterfaces;
// can use abstract as well
interface Computer{

}
// but have to use extends instead of implements
class Desktop implements Computer{

}
class Laptop implements Computer{

}
class Developer {
    public void devApp(Computer comp) {
        System.out.println("Coding...");
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer guru = new Developer();
        guru.devApp(laptop);
        guru.devApp(desktop);
    }
}
