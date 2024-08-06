package BasicSorting;
//Used where the numbers are not big
public class CountingSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,3,4,5};
        printArray(arr);
        countingSort(arr);
        printArray(arr);
    }
}
