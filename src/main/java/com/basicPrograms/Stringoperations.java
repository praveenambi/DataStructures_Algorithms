package com.basicPrograms;

import java.io.File;

public class Stringoperations {

    public static void main(String[] args) {


        String str  = "showing results 1-50 of 7840";

        System.out.println(str.substring(str.length()-2));
       String[] strArry =  str.split(" ");
        System.out.println(strArry[strArry.length-1]);
        String home = System.getProperty("user.home");
        File file = new File(home+"/Downloads/" + "TestEvidences" + ".txt");

        System.out.println(file.getAbsolutePath());
    }
}
