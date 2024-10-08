package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(5);
        list.add(4);
        
        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
