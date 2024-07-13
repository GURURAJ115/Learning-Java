package Conditional;

import java.util.Scanner;

// Print if the number is even or odd
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
}
