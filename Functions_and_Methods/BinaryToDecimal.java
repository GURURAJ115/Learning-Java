package Functions_and_Methods;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BtoD(int n){
        int pow = 0;
        int dec = 0;
        int bin = n;
        while(bin>0){
            int lastDigit=bin%10;
            dec=dec+lastDigit*(int)Math.pow(2, pow);
            pow++;
            bin=bin/10;
        }
        return dec;
    }

public static int DtoB(int m){
    int pow = 0;
        int dec = m;
        int bin = 0;
        while(dec>0){
            int lastDigit=dec%2;
            bin=bin+lastDigit*(int)Math.pow(10, pow);
            pow++;
            dec=dec/2;
        }
        return bin;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number:");
        int n = sc.nextInt();
        System.out.println("Enter a Decimal Number");
        int m = sc.nextInt();
        sc.close();
        int y=DtoB(m);
        int x=BtoD(n);
        System.out.println("Decimal of "+ n +" is "+ x);
        System.out.println("Binary of "+ m +" is "+ y);
    }
}