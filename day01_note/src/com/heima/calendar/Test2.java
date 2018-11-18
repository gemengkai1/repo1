package com.heima.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
键盘录入一个日期, 打印出当前日期是这一年的第多少天

         录入格式为: 2015-10-20

         是2015年的第 293天
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入日期");
        String s=sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        Calendar ca=Calendar.getInstance();
        ca.setTime(date);
        int day=ca.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

    }
}
