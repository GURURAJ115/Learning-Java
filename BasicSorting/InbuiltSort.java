package BasicSorting;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,8,3,4,5};

        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);

        Integer arr1[] = {5,43,31,12,14,16};
        Arrays.sort(arr1,Collections.reverseOrder());
        printArray(arr1);
    }
}
