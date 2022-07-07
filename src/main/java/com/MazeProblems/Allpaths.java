package com.MazeProblems;


/**
 * This programme is never ending loop , because it get stuck in the endless loop
 * since we are revisiting previous cells in the matrix
 *
 * Please refer to te recursive tree for more information  : ![](AllPathsRecursivetree.png)
 *
 *
 * The Solution : the solution is , mark the already visited cells as false , so the it doesnt visit them again
 */



public class Allpaths {


    public static void main(String[] args) {

        boolean[][] board =  {
                {true,true,true},
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPaths("",board,0,0);

    }



    public static void allPaths(String path, boolean[][] maze, int row, int col){

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
            allPaths(path+"↓ ",maze, row+1,col);

        }

        // when col is less than last col number , increment the col count with 1 and ammend path with R
        if (col<maze[0].length-1){

            allPaths(path+"➔ ",maze, row,col+1);
        }


        if (row>0){

            allPaths(path+"UP ",maze, row-1,col);
        }

        if (col>0){

            allPaths(path+"LEFT ",maze, row,col-1);
        }

    }

}
