package BasicSorting;
// it goes like playing cards 
// sorted part and unsorted part
public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={8,9,3,4,5};
        printArray(arr);
        insertionSort(arr); 
        printArray(arr);

    }
}
