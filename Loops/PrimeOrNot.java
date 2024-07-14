package Loops;

import java.util.Scanner;

// Check if the given number is prime or not
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        boolean x = true;
        if(n==2){
            System.out.println(n+ " is a prime number");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    x = false;
                }
            }
            if(x==true){
                System.out.println(n+" is a prime number");
            }
            else if(x==false){
                System.out.println(n+" is not a prime number");
            }
        }
        
    }
}
