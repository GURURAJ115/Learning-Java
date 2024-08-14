package BackTracking;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
            // int x = gridWays(0,0,m,n);
            // return x;
            int x = fact((m-1)+(n-1))/(fact(n-1)*fact(m-1));
            return x;
        }
        public static int fact(int n){
            if(n==0){
                return 1;
            }
            int fn = n*fact(n-1);
            return fn;
        }
        public static void main(String[] args) {
            System.out.println(uniquePaths(10,10));
        }
}
