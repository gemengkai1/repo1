package com.heima.SimpleDateFormat1;
//需求: 请使用日期时间相关的API，计算出一个人已经出生了多少天。
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
       Scanner sc= new Scanner(System.in);
        System.out.println("请输入您的生日(例如:2018年12月12日)");
       String s =sc.nextLine();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdaydate = sdf.parse(s);
        Date todaydate=new Date();
        long time =todaydate.getTime()-birthdaydate.getTime();
        System.out.println("你来到世上一共"+(time/1000/60/60/24)+"天");

    }
}
