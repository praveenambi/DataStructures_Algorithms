package com.MazeProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MazePaths {


    /**
     * Thsi method counts the no of  paths to reach the destaination as shown in the recursive tree
     * Please refer to the ![](Maze problemTree.png)  for clear explanation of recursive tree
     *
     *
     *
     * @param row  : row of matrix
     * @param col  : column of matric
     * @return : this method need to return the int param as no of paths
     *
     */
    public  static int countPaths(int row , int col){

        // base condition: whenever the row or coloumn become 1 , then there will be only one path to reach the destination
        // so return 1

        if (row==1 || col==1){

            return 1;


        }

                  /*
                  as per the recursive tree  on the left side of tree, we are  decreasing row by count 1  and
                  as per recursive tree on the right side of tree , we are decreasing  coloumn by count 1
                   */
        int leftTree=countPaths(row-1,col);
        int rightTree=countPaths(row,col-1);


        return  leftTree+rightTree;
    }


    public static ArrayList<String> printpathArry(String path, int row, int col){

        //base condition : when row and col become 1 then  print path

        if (row==1 && col==1){

           // System.out.println(path);
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
  // creating an empty arrallist to add the recursive paths from each recursion
        ArrayList<String> list = new ArrayList<String>();

        // when row is greater than 1 , reduce the row count with 1 and ammend path with D
        if (row>1){
            list.addAll(printpathArry(path+'D', row-1,col));

        }

        // when col is greater than 1 , reduce the col count with 1 and ammend path with R
        if (col>1){

            list.addAll(printpathArry(path+'R', row,col-1));
        }


        return list;
    }



    public static void printpath(String path, int row, int col){

        //base condition : when row and col become 1 then  print path

        if (row==1 && col==1){

            System.out.println(path);
        }




        // when row is greater than 1 , reduce the row count with 1 and ammend path with D
        if (row>1){
            printpath(path+'D', row-1,col);

        }

        // when col is greater than 1 , reduce the col count with 1 and ammend path with R
        if (col>1){

            printpath(path+'R', row,col-1);
        }


    }


    public static void main(String[] args) {


        int paths =  countPaths(3,3);

        System.out.println("The no ways to reach destinatio are "  + paths);

        System.out.println(printpathArry("",3,3));

        printpath("",3,3);
    }
}
