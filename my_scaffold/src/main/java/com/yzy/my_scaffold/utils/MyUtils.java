package com.yzy.my_scaffold.utils;

/**
 * @Author YangZhenYuan
 * @Date 2020/3/17 20:19
 * @Version 1.0
 * @Describe
 */
public class MyUtils {

    public  static void getA(int num){
        for(int i=0;i<32;i++){
            int t=(num & 0x80000000>>>i) >>>(31-i);
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        getA(2);
    }
}
