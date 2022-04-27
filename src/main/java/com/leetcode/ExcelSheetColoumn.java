package com.leetcode;


/*
 leetcode link = https://leetcode.com/problems/excel-sheet-column-title/submissions/

 */
public class ExcelSheetColoumn {


    public static void main(String[] args) {
        String colomn = convertToTitle(33);
        System.out.println("Coloum is  " + colomn);



    }

    public static String convertToTitle(int columnNumber) {

        int rem =0;
        StringBuilder strb = new StringBuilder();

        while (columnNumber>=0){

            rem = (columnNumber%26)+65-1;

            if (rem<65){
                rem=65;
            }
           char c =  (char)(rem);
            strb = strb.append(c);
            columnNumber=(columnNumber/26)-1;

        }

        return  strb.reverse().toString();
    }





}
