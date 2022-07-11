package com.MazeProblems;

public class SudukoSolver {


    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solveSuduko(board)){
            display(board);
        }else {
            System.out.println("Suduko can not be solved");
        }

    }


    public  static boolean solveSuduko(int[][] board){

        int row =-1;
        int col= -1;
        boolean emptyLeft=true;

        // this is basically how we are replacing th row and col from arguments
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                if (board[i][j]==0){  // that means i have found n empty item
                    row=i;
                    col=j;
                    emptyLeft=false;  // setting flasg to false , means no empty places left
                    break;
                }
            }

            // if you found empty cell in the row , then break it
            if (emptyLeft==false){
                break;
            }
        }
        // if you found empty cell in the row , then break it
        if (emptyLeft==true){
            return true;
            // if no empty elements left , that means suduko is solved
        }

        // back track
        for (int number = 1; number <=9 ; number++) {
            if (isSafe(board,row,col,number)){
                board[row][col]=number;
                if (solveSuduko(board)){
                    display(board);
                    return true;
                }else {
                    // if not solved then back track , means setting the respective cell to 0
                    board[row][col]=0;
                }
            }

        }
        return  false;
    }

    private static void display(int[][] board) {

        for (int[] row: board) {
            for (int num: row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }


    }

    public  static boolean  isSafe(int[][] board, int row,int col,int number){
        /*check the row */
        for (int i = 0; i <board.length ; i++) {
            //check  if the number is already in row or not
            if (board[row][i] == number) {
                return false;
            }
        }
            /*check the col */
            for (int[] numbers:board ) {  // checking for every single row but for same col, so checking for each number from 1 to 9
                if (numbers[col]==number){
                    return  false;
                }
            }

            int sqrt = (int) (Math.sqrt(board.length));// to get the square root of board , which will  be used in modulo formulae
            int rowStart = row - (row%sqrt);
            int colStart = col - (col%sqrt);

            for (int r = rowStart; r< rowStart+sqrt ; r++) { // loop runs from start of each row  till end row of  each 3*3  box
                for (int c = colStart; c < colStart+sqrt; c++) {    // loop runs from start of each col  till end col of  each 3*3  box
                    if (board[r][c]==number){
                        return  false;
                    }
                }
        }
        return  true;
    }

}
