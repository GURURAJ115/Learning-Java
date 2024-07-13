package Loops;

import java.util.Scanner;

// Print reverse of a given number.
public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        int n = 0;
        while(x>0){
            n=(n*10)+(x%10);
            x=x/10;
        }
        System.out.println("The reverse of the given number is :"+n);
        sc.close();
    }
}
