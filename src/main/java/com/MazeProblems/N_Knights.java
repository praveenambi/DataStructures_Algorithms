package com.MazeProblems;

/**
        * we are just impimenting the therory expained in the explaination as attached to this file
        * please refer to the ![](NKnights_recursivetree.png) for detailed explainations
        *
        */


public class N_Knights {


    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println("Possible ways of placing then Knights are");
        findKnightPaths(board,0,0,n);

    }

    public  static  void findKnightPaths(boolean[][] board,int row, int col,int knights){
        // base condition
        if (knights==0){

            display(board);
            System.out.println();
            return;
        }

        //  to check the out pf bound conditions , if row  is last one and col reaches last row , then just skip it
        if (row==board.length-1 && col==board.length){
            return;
        }

        if (col==board.length){
            findKnightPaths(board,row+1,0,knights);
            return;
        }

        if (isSafe(board,row,col)){
            board[row][col]=true;  // if its afe to place , place it , make cell as true
            findKnightPaths(board,row,col+1,knights-1);  // if its safe to place then row is same , and col will be increased by 1 and knights will be reduced by 1
            board[row][col]=false;  // after  functions call over, back track  it
        }

        findKnightPaths(board,row,col+1,knights); // if not placed just move on , knights will be same as , we didnt place it in the cell, so move on to  nect col

    }

    // to verify , whether its safe to place the knight at prticular row and col, thats why checking with isSafe method
    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isRowColoumns_InRange(board,row-2,col-1)){ // at every single time to check the matrix range , created that method
            if (board[row-2][col-1]){
                return  false;
            }
        }
        if (isRowColoumns_InRange(board,row-1,col-2)){ // at every single time to check the matrix range , created that method
            if (board[row-1][col-2]){
                return  false;
            }
        }
        if (isRowColoumns_InRange(board,row-2,col+1)){ // at every single time to check the matrix range , created that method
            if (board[row-2][col+1]){
                return  false;
            }
        }
        if (isRowColoumns_InRange(board,row-1,col+2)){ // at every single time to check the matrix range , created that method
            if (board[row-1][col+2]){
                return  false;
            }
        }

     return true; // at the end of each Safe condition ,if nothing returns false , then true, means its afe to place the knight

    }


    // to verify the rows and coloumns are within range of matrix
    public  static boolean isRowColoumns_InRange(boolean[][] board, int row, int col){
        if (row>=0 && row< board.length && col>=0 && col< board.length){
            return  true;
        }
        return  false;
    }


    /* this method is to display the board with Knights places*/
    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean element: row) {
                if (element){ // for each row cell, if the element is true , the place Queen
                    System.out.print("♞ ");
                }else {
                    System.out.print("■ ");
                }
            }
            System.out.println();

        }

    }
}

