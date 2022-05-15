package com.recursion;

public class Pattern {

    public static void main(String[] args) {



        printpattern(0,4);
    }


    public static void printpattern(int row , int col){

        if (row<col){

            return;
        }

        if (row>col){

            System.out.print("*");
            printpattern(row,col+1);

        }else {

            System.out.println();
            printpattern(row-1,0);
        }




    }

}
