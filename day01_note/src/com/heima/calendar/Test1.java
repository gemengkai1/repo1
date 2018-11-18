package com.heima.calendar;

import java.util.Calendar;

public class Test1 {
    public static void main(String[] args) {
        //获取子类对象的方法
        Calendar ca = Calendar.getInstance();
        int i = ca.get(Calendar.YEAR);
        int day=ca.get(Calendar.DAY_OF_MONTH);
        int month=ca.get(Calendar.MONTH)+1;
        System.out.println(day);
        System.out.println(month);
        int week=ca.get(Calendar.DAY_OF_WEEK);
        char[] cArr = {' ', '日','一','二','三','四','五','六'};
        System.out.println(cArr[week]);

    }
}
