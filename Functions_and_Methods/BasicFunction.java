package Functions_and_Methods;

import java.util.Scanner;

public class BasicFunction {
    public static int Something(int n){
        return 3;
    }
    public static void Something() {
        System.out.println("Hello Drivers");
    }
    public static int factorial(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int BinomialCoeficcient(int a, int b){
        int n_fact = factorial(a);
        int r_fact = factorial(b);
        int nr_fact = factorial(a-b);
        int bc = n_fact/(r_fact*nr_fact);
        return  bc;
    }

public static boolean isPrime(int n){
        boolean x = true;
        if(n==2){
            return x;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    x = false;
                }
            }
            return x;
        }
}
public static void checkPrime(int n){
    boolean x=isPrime(n);
    if(x==true){
        System.out.println("Given number is prime");
    }
    else{
        System.out.println("Given number is not prime");
    }
}
public static void printPrime(int n){
    for(int i=2;i<=n;i++){
    if(isPrime(i)){
        System.out.println(i+ " ");
    }
}
}
    public static void main(String[] args) {
        // Something();
        // Something();
        // System.out.println(Something(4));
        // System.out.println(factorial(5));
        // System.out.println(BinomialCoeficcient(5,2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        checkPrime(n);
        printPrime(n);
    }
}
