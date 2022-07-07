package com.MazeProblems;

import java.util.Arrays;

public class AllPaths_BackTrack_printPath {



    public static void main(String[] args) {

        boolean[][] board =  {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };


        int[][] matrixPath = new int[board.length][board[0].length];

        allPathsBacktrack_Print("",board,0,0,matrixPath,1);

    }






    public static void allPathsBacktrack_Print(String path, boolean[][] maze, int row, int col,int[][] matrixPath, int step){

        //base condition : when row and col become 1 then  print path

        if (row==maze.length-1 && col==maze[0].length-1){
            matrixPath[row][col]= step; //since last step is also a step  , adding it
            //when i am in the base condition print the array pf matrix path
            for (int[] arr: matrixPath) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        // when row and col index is false , the stop the recursion and return back
        if (!maze[row][col]){
            return;
        }

        //here at the begining of the function call , i am marking the visited cell as false ,

        maze[row][col] = false;
        matrixPath[row][col]= step; // when at the matrix path , it will be having myh step value


        // when row is less than row numer , increment the row count with 1 and ammend path with D
        if (row<maze.length-1){
            allPathsBacktrack_Print(path+"DOWN ",maze, row+1,col,matrixPath,step+1);

        }

        // when col is less than last col number , increment the col count with 1 and ammend path with R
        if (col<maze[0].length-1){

            allPathsBacktrack_Print(path+"RIGHT ",maze, row,col+1,matrixPath,step+1);
        }


        if (row>0){

            allPathsBacktrack_Print(path+"UP ",maze, row-1,col,matrixPath,step+1);
        }

        if (col>0){

            allPathsBacktrack_Print(path+"LEFT ",maze, row,col-1,matrixPath,step+1);
        }

        // so this is the line where the function call gets over  and the function will be removed from the stack
        // so before the function gets removed, also revert the changes made by that function


        maze[row][col] = true;
        matrixPath[row][col]= 0; // at end of the recyrsion function  call , resetting it to 0;
    }
}
