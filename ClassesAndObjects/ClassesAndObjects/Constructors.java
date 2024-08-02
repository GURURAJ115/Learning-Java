package ClassesAndObjects;
public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Gururaj");
        Student s1 = new Student();
        // System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
//default constructor will be called by  java if no constructors are defined by the user.
    // Student(String name){
    Student(){
    //This is a constructor
    // this.name = name;
    System.out.println("Constructor is called....");
    }
}
