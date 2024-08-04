package Recursion;

public class RecursionBasics {
    //Call Stack Decreasing order
    public static void printn(int n){
        if(n==1){
            System.out.println("1");
            return;
        }// If there is no base case then stack will overflow
        System.out.println(n+" ");
        printn(n-1);
    }
    // Ascending order
    public static void printna(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }// If there is no base case then stack will overflow
        printna(n-1);
        System.out.println(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn = n*fact(n-1);
        return fn;
    }

    public static int Sumofn(int n){
        if(n==1){
            return 1;
        }
        int sn = n+Sumofn(n-1);
        return sn;
    }

    public static int fib(int n){
        if(n==1||n==0) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Decreasing");
        printn(n);
        System.out.println("increasing");
        printna(n);
        System.out.println(fact(n));
        System.out.println(Sumofn(n));
        System.out.println(fib(n));
    }
}

