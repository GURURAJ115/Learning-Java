package Loops;

import java.util.Scanner;

// to print a right angled triangle
// *
// **
// ***
// ****
// *****
public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        char a='a'-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print((char)(a+i));
            }
            System.out.println();
        }
    }
}
