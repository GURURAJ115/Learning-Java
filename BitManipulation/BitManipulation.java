package BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1; // to get the last bit
        if((n&bitMask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0) return 0;
        else return 1;
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the position :");
        int i = sc.nextInt();
        sc.close();
        System.out.print("Given Number is : ");
        oddOrEven(n);
        System.out.println("The "+i+" bit is : "+getIthBit(n, i));
        System.out.println("After setting the "+i+" bit: "+setIthBit(n, i));
        System.out.println("After clearing the "+i+" bit: "+clearIthBit(n, i));
        System.out.println("After clearing "+i+" bits:"+clearIBits(n,i));
    }
}
