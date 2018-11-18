package com.heima.homework;

/*
   定义数字字符串数组{"010","3223","666","7890987","123123"}；
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
	第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
	(4)最终打印该数组中对称字符串的个数。
 */
public class Work10 {
    public static void main(String[] args) {
        String[] arr = {"010", "3223", "666", "7890987", "123123"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            if (sb.reverse().toString().equals(arr[i])) {
                count++;
                System.out.println("对称的字符串为:" + arr[i]);
            } else {
                System.out.println("不对称的字符串为:" + arr[i]);
            }

        }
        System.out.println("对称的字符串个数为:" + count);
    }
}
