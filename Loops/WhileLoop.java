package Loops;

import java.util.Scanner;

// Print 1-n
public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
