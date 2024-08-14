package BackTracking;

public class NQueen {
    static int count = 0;
    public static int totalNQueens(int n) {
        char board[][]= new char[n][n];
        nQueens(board,0);
        return count;
    }
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //base
        if(row==board.length){
            count++;
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1); //function call
                board[row][j]='.';//backtracking
            }
        }
    }
    public static void main(String[] args) {
        int x=totalNQueens(1);
        System.out.println(x);
    }
}

