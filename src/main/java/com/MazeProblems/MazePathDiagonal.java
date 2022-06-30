package com.MazeProblems;

import java.util.ArrayList;

public class MazePathDiagonal {



    /**
     * Thsi method counts the no of  paths to reach the destaination as shown in the recursive tree
     * Please refer to the ![](MazeprintPathsDiagonal.png) for clear explanation of recursive tree
     *
     *
     *
     * @param row  : row of matrix
     * @param col  : column of matrix
     * @param path  : path of the traverse
     * @return : this method need to return the int param as no of paths
     *
     */

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

        // when row is greater than 1 , reduce the row count with 1 and ammend path with V
        if (row>1){
            list.addAll(printpathArry(path+'V', row-1,col));

        }


        // when row is greater than 1 , column is greater than 1 , reduce both count with 1 and amend D
        if (row>1 && col>1){
            list.addAll(printpathArry(path+'D', row-1,col-1));

        }
        // when col is greater than 1 , reduce the col count with 1 and ammend path with H
        if (col>1){

            list.addAll(printpathArry(path+'H', row,col-1));
        }


        return list;
    }

    public static void main(String[] args) {


        System.out.println(printpathArry("",3,3));

    }


}
