package BasicSorting;
//The worst case and best case time complexity both were O(n2) to reduce it for best case which is sorted array swap count we have taken so that in first iteration if there are no swaps then it will come out of the loop
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int swap = 0; 
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("The array was already sorted");
                return;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
