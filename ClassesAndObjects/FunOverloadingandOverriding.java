public class FunOverloadingandOverriding{
    public static void main(String[] args) {
        
    }
}
// This is polymorphism
class Employee{
    public void something(){
        System.out.println("Hello");
    }//Function overloading
    public void something(int x){
        System.out.println("OHO");
    }
}
class Peon extends Employee{
    public void something(){
        System.out.println("OHnooo");
    }//Function overriding
}