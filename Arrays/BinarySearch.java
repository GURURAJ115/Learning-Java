package Arrays;

public class BinarySearch {
    public static int binarysearch(int numbers[], int key){
        int start = 0 ;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key == numbers[mid]){
                return mid;
            }
            if(key>numbers[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        int key = 2;
        System.out.println("The key is found at position: "+binarysearch(numbers, key));
    }
}