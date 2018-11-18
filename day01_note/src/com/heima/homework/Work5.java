package com.heima.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08
public class Work5 {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=simpleDateFormat.format(d);
        System.out.println(s);

    }
}
