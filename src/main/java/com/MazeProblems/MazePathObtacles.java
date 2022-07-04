package com.MazeProblems;

public class MazePathObtacles {

    /**
     * This method counts the no of  paths to reach the destination as shown in the recursive tree, when there is an obstacle
     * Please refer to the ![](MazePathObstacle.png) for clear explanation of recursive tree
     *
     *
     * @param row  : row of matrix
     * @param col  : column of matrix
     * @param path  : path of the traverse
     * @param maze  : maze is a boolean 3*3 board
     *
     */


    public static void printpathObstacle(String path, boolean[][] maze, int row, int col){

        //base condition : when row and col become 1 then  print path

        if (row==maze.length-1 && col==maze[0].length-1){

            System.out.println(path);
        }

        // when row and col index is false , the stop the recursion and return back
        if (!maze[row][col]){
            return;
        }


        // when row is less than row numer , increment the row count with 1 and ammend path with D
        if (row<maze.length-1){
            printpathObstacle(path+"↓ ",maze, row+1,col);

        }

        // when col is less than last col number , increment the col count with 1 and ammend path with R
        if (col<maze[0].length-1){

            printpathObstacle(path+"➔ ",maze, row,col+1);
        }
    }


    public static void main(String[] args) {

        boolean[][] board =  {
                {true,true,true},
                {true,false,true},
                {true,true,true},
                {true,true,true}
        };

        printpathObstacle("",board,0,0);

    }


}
