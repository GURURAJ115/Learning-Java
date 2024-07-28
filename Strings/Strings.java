package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("Enter the search character : ");
        String key = sc.next();
        sc.close();
        int n=s.length();
        boolean x = false;
        int j=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==key.charAt(0)){
                x = true;
                j=i;
                break;
            }
        }
        if(x == true){
            System.out.println("Character is present in the string , found at position : "+j);
        }
        else{
            System.out.println("Character not found");
        }
    }
}
