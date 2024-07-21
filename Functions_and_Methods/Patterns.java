package Functions_and_Methods;

import java.util.Scanner;

public class Patterns {
    public static void HollowRectangle(int totalRows,int totalColumns){
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalColumns;j++){
                if(i==1||i==totalRows||j==1||j==totalColumns){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void RotatedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InvertedHalfPyramid(int n){
        
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void FloydsTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void ZeroOneTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void ButterflyPattern(int n){
        for ( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        for ( int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==n||i==1||j==1||j==n)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void DiamondPattern(int n){
        for( int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows :");
        int m = sc.nextInt();
        System.out.println("Enter the Number of Columns :");
        int n = sc.nextInt();
        HollowRectangle(m, n);
        System.out.println("Enter the number of sides for lines:");
        int x=sc.nextInt();
        RotatedHalfPyramid(x);
        InvertedHalfPyramid(x);
        FloydsTriangle(x);
        ZeroOneTriangle(x);
        ButterflyPattern(x);
        SolidRhombus(x);
        HollowRhombus(x);
        DiamondPattern(x);
        sc.close();
    }
}
