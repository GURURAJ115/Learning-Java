package Loops;

import java.util.Scanner;

// To print square pattern
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no.of lines");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
