// 3. Write a Java program that takes three numbers from the user and prints the greatest number.
package Conditional;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println(a+" is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest");
        }
        else{
            System.out.println(c+" is the greatest");
        }
    }
}
