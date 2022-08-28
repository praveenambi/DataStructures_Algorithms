package com.MazeProblems;

/**
 * we are just impimenting the therory expained in the explaination as attached to this file
 * please refer to the ![](NQueens_RecursiveTree.png) for detailed explainations
 *
 *
 * Time complexity : The reccurence relation is
 *     T(n) = n *  T(n-1) + O(n'2)      // when queen is placed at 0,0 , its going to iterate the recursion  through n-1 rows, and it checks for each coloumn cell i,e n time, plus  iterating 2d array of n2
 *          = O(n3 + n!)
 *          = O(n!)    // Time complexity is  O(n!)
 *
 *
 */



public class NQueens {


    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        int totalWays = findQueenPath(board,0);
        System.out.println("Total no of ways " + totalWays);


        for (boolean[] i : board) {



        }

    }




    public static int findQueenPath(boolean[][] board,int row){


        //since we are starting the coloumn from 0 every time it doesnt make any sense to pass it in the argument of function
        //base condition : when the  queen is placed at teh last row of the matrix , then display the  board ,means all queens are placed

        if (row==board.length){
            display(board);
            System.out.println(); // after displaying he board , add new line so output will be readable properly
            return 1;
        }

        int count =0;

// here we are placing the queen for each row and coloumn
        for (int col = 0; col < board.length; col++) {
            //place the queen if the place is safe
            if (isSafe(board,row,col)){  // if its safe to place on the  board , row and coloumn
                board[row][col]=true;
                count=count+  findQueenPath(board,row+1);
                board[row][col]=false; // reset it to original state , once the recursive function call is over
            }

        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {


        //check vertical row and i is iterating as row
        for (int i = 0; i < row ; i++) {

            if (board[i][col]){  // if for the row and column , queen over there ,then its not safe to place queen there, return false
                return false;
            }

        }

        // diagonal left check
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <=maxLeft ; i++) {
            if (board[row-1][col-1]){

                return  false;
            }

        }

        // diagonal right check
        int maxRight =  Math.min(row,board.length-col-1);       // -1 , because its board starts from 0
        for(int i = 1; i<=maxRight; i++) {
            if (board[row-1][col+1]){  // as per the daigram , row is decreasing and coloumn is increasing, so row-- and col++
                return  false;
            }
        }
        return true;
    }


    /* this method is to display the board with queen places*/
    private static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean element: row) {
                if (element){ // for each row cell, if the element is true , the place Queen
                    System.out.print("♛ ");
                }else {
                    System.out.print("■ ");
                }
            }
            System.out.println();

        }

    }


}
