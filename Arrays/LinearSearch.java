package Arrays;

public class LinearSearch {
    public static int linearsearch(int numbers[],int search){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,};
        int search=10;
        int index = linearsearch(numbers, search);
        if(index==-1){
            System.out.println("Element Not found!");
        }
        else{
            System.out.println("Element found at index :"  +index);
        }
    }
}
