package com.heima.date;

import java.text.ParseException;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) throws ParseException {
       Date d1=new Date();
        System.out.println("当前时间为:"+d1);
        Date d2=new Date(0);
        System.out.println("基准时间为"+d2);
        Date d3=new Date(1000);
        System.out.println("基准时间加上参数毫秒的时间为:"+d3);
        long time = d3.getTime();
        System.out.println("基准时间到这个日期的毫秒为:"+time);
        System.out.println("基准时间到现在日期的毫秒为:"+System.currentTimeMillis());


    }
}
