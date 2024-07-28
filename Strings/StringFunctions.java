package Strings;

import java.util.Scanner;

public class StringFunctions {
    public static void Compare(){
        String s1 = "Guru";
        String s2 = "Guru";
        String s3 = new String("Guru");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s2.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<=ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // Compare(); // String.equals method should be used
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        System.out.println("Enter starting index :");
        int si = sc.nextInt();
        System.out.println("Enter ending index :");
        int ei = sc.nextInt();
        sc.close();
        // System.out.println(substring(s, si, ei));
        System.out.println(s.substring(si,ei));
    }
}
