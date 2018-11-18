package com.heima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//用程序判断2018年2月14日是星期几
public class Work7 {
    public static void main(String[] args) throws ParseException {
        Calendar ca=Calendar.getInstance();
        String s="2018年2月14日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(s);
        ca.setTime(date);
        int week=ca.get(Calendar.DAY_OF_WEEK);
        char [] arr={' ','日','一','二','三','四','五','六'};
        System.out.println(arr[week]);
    }
}
