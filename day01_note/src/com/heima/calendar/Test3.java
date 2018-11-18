package com.heima.calendar;

import java.util.Calendar;

public class Test3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2018,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        if(day==29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }

    }
}
