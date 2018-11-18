package com.heima.homework;

public class Work9 {
    public static void main(String[] args) {
        String s1="a";

        long start= System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1 +=i;
        }
        long end= System.currentTimeMillis();
        System.out.println(end-start);

        StringBuilder sb=new StringBuilder();
        long start1= System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end1= System.currentTimeMillis();
        System.out.println(end1-start1);
    }
}


