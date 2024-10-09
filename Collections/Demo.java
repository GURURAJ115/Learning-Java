package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        
        // To have indexed values we should use list.
        // List can have same values
        // List<Integer> nums = new ArrayList<>();
        
        Set<Integer> nums = new HashSet<Integer>();//for unique values

        nums.add(6);
        nums.add(6);
        nums.add(5);
        nums.add(4);
        // System.out.println(nums.get(2));
        
        // for(int n: nums){
        //     System.out.println(n);
        // }
        // System.out.println(nums);
        
        //Iterator is the top most interface
        // Iterator
        // Collection
        // Set List Queue
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
