// 1. Write a Java program to get a number from the user and print whether it is positive or negative.
package Conditional;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n<0){
            System.out.println("Given number is negative");
        }
        else if(n>0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is Zero");
        }
        sc.close();
    }
}
