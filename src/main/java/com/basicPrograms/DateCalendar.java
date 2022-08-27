package com.basicPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendar {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String strDate= formatter.format(date);
        System.out.println(strDate);
    }
}
