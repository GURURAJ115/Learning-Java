package Strings;

import java.util.Scanner;

public class Path {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S') y--;
            else if(dir == 'N') y++;
            else if(dir == 'W') x--;
            else x++;
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directions in NSEW: ");
        String path = sc.nextLine();
        sc.close();
        System.out.println(getShortestPath(path));
    }
}
