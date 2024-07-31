package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
