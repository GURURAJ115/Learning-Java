package ArrayList;

import java.util.ArrayList;

//sorted array
public class PairSum1 {
    public static boolean bruteforce(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)+list.get(j)==target){
                return true;
            }
        }
        }
        return false;
    }
    //2 Pointer approach
        public static boolean optimised(ArrayList<Integer> nums, int target) {
            int lp = 0;
            int rp = nums.size() -1;
            int [] ans = new int[2];
            while(lp!=rp){
                if(nums.get(lp)+nums.get(rp)==target){
                    ans[0]=lp;
                    ans[1]=rp;
                    return true;
                }
                if(nums.get(lp)+nums.get(rp)<target){
                    lp++;
                }
                else rp--;
            }
            return false;
        }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 61;
        System.out.println(bruteforce(list, target));
        System.out.println(optimised(list,target));
    }
}
