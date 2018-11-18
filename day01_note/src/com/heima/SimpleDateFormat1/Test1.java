package com.heima.SimpleDateFormat1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(new Date());
        System.out.println("现在北京时间为:"+s);
        String sr="2018-08-13 20:25:40";
        Date date = sdf.parse(sr);
        System.out.println(date);


    }
}
