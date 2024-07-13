// 2. Write a Java program to solve quadratic equations (use if, else if and else).
package Conditional;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        sc.close();
        double result = b*b - (4*a*c);

        if(result>0){
            double r1= (-b + Math.sqrt(result))/(2*a);
            double r2= (-b - Math.sqrt(result))/(2*a);
            System.out.println("The roots are "+r1+"and"+r2);
        }
        else if(result==0){
            double r3 = -b/(2*a);
            System.out.println("The root is"+r3);
        }
        else{
            System.out.println("There are no real roots for the equation");
        }

    }
}
