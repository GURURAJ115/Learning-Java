package BackTracking;

import java.util.Scanner;

public class NQueenCount {
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
                printBoard(board);
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
        public static void printBoard(char board[][]){
            System.out.println("----------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the board length (a*a): ");
            int n=sc.nextInt();
            sc.close();
            char board[][]= new char[n][n];
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    board[i][j]='.';
                }
            }
            nQueens(board,0);
            
        }
    }
