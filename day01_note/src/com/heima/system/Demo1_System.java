package com.heima.system;

import java.util.Arrays;

public class Demo1_System {
    public static void main(String[] args) {
        long time =System.currentTimeMillis();
        System.out.println(time);
       int [] arr={1,2,3,4,5};
       int [] end=new int [arr.length];
       System.arraycopy(arr,0,end,0,4);
        System.out.println(Arrays.toString(end));

    }
}
