package com.heima.stringbuilder;

public class Demo1_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder a=sb.append("红");
        System.out.println(a);
        StringBuilder b=sb.append("黄");
        System.out.println(b);
        StringBuilder c=sb.append("蓝");
        System.out.println(c);
        System.out.println("---------");
        System.out.println(sb);
        System.out.println(a==c);
        System.out.println(c==sb);

    }
}
