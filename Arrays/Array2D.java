package Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the matrix are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the Search Element :");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==x){
                    System.out.println("Element found at location ("+i+","+j+")");
                }
            }
        }
    }
}
