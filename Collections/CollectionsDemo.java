package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(6);
        nums.add(5);
        nums.add(4);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
