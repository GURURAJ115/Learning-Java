package ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
            // Or use
            // Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
}
