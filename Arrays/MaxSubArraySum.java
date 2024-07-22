package Arrays;
public class MaxSubArraySum {
public static int Bruteforce(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            currSum=0;
            for(int k=i;k<=j;k++){
                currSum+=numbers[k];
            }   
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
    }
    return maxSum;
}
public static int prefixSum(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    int prefix[]=new int[numbers.length];
    prefix[0]=numbers[0];
    for(int i=1;i<numbers.length;i++){
        prefix[i]=prefix[i-1]+numbers[i];
    }

    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            currSum = i == 0 ?  prefix[j] : prefix[j] - prefix[i-1];
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        
    }
    return maxSum;
}
public static int kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0;i<numbers.length;i++){
        cs=cs+numbers[i];
        if(ms<cs){
            ms=cs;
        }
        if(cs<0){
            cs = 0;
        }
        
    }
    return ms;
}
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,-9};
        System.out.println(Bruteforce(numbers));
        System.out.println(prefixSum(numbers));
        System.out.println(kadanes(numbers));
    }
}
