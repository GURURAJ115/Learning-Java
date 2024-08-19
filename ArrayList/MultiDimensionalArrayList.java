package ArrayList;
import java.util.ArrayList;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        for(int j=1;j<=3;j++){
            ArrayList<Integer> templist = new ArrayList<>();
            for(int i=1;i<=5;i++){
                templist.add(i*j);
            }
            mainList.add(templist);
        }
        System.out.println(mainList);
    }
}
// Container with most water
//https://leetcode.com/submissions/detail/1360924695/