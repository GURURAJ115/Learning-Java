package BackTracking;

public class btInArrays {
    public static void changeArray(int arr[],int i, int val){
        if(i==arr.length){
            printArray(arr);
            return;
        }
        arr[i]=val;
        changeArray(arr, i+1, val+1); // Recursion  1,2,3,4,5
        arr[i]=arr[i]-2;              // BackTracking' -1,0,1,2,3
        //BT condition always comes after recursive function
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}
