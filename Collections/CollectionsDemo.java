package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsDemo {
    public static void main(String[] args) {
        // To get this done we use comparator
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j){
                if(i%10>j%10)
                    return 1;
                else 
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        //To sort based on our own logic like based on the last digit
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        //normal sort 29 31 43 72
        Collections.sort(nums);
        System.out.println(nums);
        //using comparator 31 72 43 29
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
