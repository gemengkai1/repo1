package com.heima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
public class Wrok6 {
    public static void main(String[] args) throws ParseException {
        String s="2018-03-04";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date da=sdf.parse(s);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        String s1=sdf1.format(da);
        System.out.println(s1);

    }
}
