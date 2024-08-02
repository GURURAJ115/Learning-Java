package ClassesAndObjects;
public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Gururaj");
        Student s0 = new Student();
        Student s1 = new Student("Guru");
        Student s2 = new Student(12);
        // System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
//default constructor will be called by  java if no constructors are defined by the user.
    
    Student(String name){
    // This is a constructor
    // Parameterized Constructor
    this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }

    Student(){
    System.out.println("Constructor is called....");
    //This is non parameterized constructor
    }
    
}
