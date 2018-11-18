package com.heima.object;

import java.util.Objects;

public class Objects1 {
    public static void main(String[] args) {
        Person p1=new Person("张三",18);
        Person p2=new Person("李四",18);

        System.out.println(Objects.equals(p1,p2));
    }
}
