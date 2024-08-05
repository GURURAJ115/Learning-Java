package Recursion;
// Given a "2xn" board and tiles of size 2x1 , count the number of ways to tile the given board using the 2x1 tiles. (A tile can either be placed vertically or horizontally)
public class TilingProblem {
    
public static int tiling(int n){
    if(n==0||n==1){
        return 1;
    }
    return tiling(n-1)+tiling(n-2);
    //Total Ways (n-1)place vertically (n-2)placed horizontally
}
public static void main(String[] args) {
    System.out.println(tiling(3));
}
}

