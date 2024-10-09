package Collections;

import java.util.HashMap;
import java.util.Map;

//Key value pairs.
public class MapsDemo {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        students.put("Guru", 91);
        students.put("Harsh", 53);
        students.put("Parth", 92);
        students.put("XYZ", 96);

        System.out.println(students);
        students.put("Raj", 99);
        System.out.println(students.get("Harsh"));
        System.out.println(students.keySet());
        for(String name:students.keySet()){
            System.out.println(name+":"+students.get(name));
        }
    }
}
