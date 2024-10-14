package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
implements Comparable<Student>
{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age>that.age){
            return 1;
        }
        else 
            return -1;
    }
    
}
public class CollectionsDemo {
    public static void main(String[] args) {
        // To get this done we use comparator
        // Comparator<Student> com = new Comparator<Student>()
        // {
        //     public int compare(Student i,Student j){
        //         if(i.age>j.age)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        Comparator<Student> com = (i,j) -> i.age>j.age?1:-1;

        List<Student> studs = new ArrayList<>();
        //To sort based on our own logic like based on the last digit
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));
        for(Student s : studs){
            System.out.println(s);
        }
        System.out.println();
        //normal sort 29 31 43 72
        // Collections.sort(studs);
        // System.out.println(studs);
        //using comparator 31 72 43 29
        // Collections.sort(studs,com);
        Collections.sort(studs);
        // System.out.println(studs);
        for(Student s : studs){
            System.out.println(s);
        }
    }
}
